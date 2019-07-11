package com.lcsw.background.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.lcsw.background.ExportExcel.util.ExportExcelUtil;
import com.lcsw.background.ExportExcel.util.ExportExcelWrapper;
import com.lcsw.background.domain.AdminPlus;
import com.lcsw.background.domain.PayDown;
import com.lcsw.background.domain.Tradeserial;
import com.lcsw.background.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/down")
public class DownController {
    @Autowired
    AdminService adminService;


    @RequestMapping("/payList")
    public JSONObject downPay(@RequestBody(required = false) String json1, HttpServletRequest request, HttpServletResponse response){
        // 准备数据
        int pageNum;
        int pageSize;
        if (json1 == null || json1 == "") {
            JSONObject object = new JSONObject();
            object.put("msg", "异常");
            return object;
        }
        JSONObject json = null;
        try {
            json = (JSONObject) JSONObject.parse(json1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (StringUtils.isEmpty(json.get("pageNum"))) {
            pageNum = 1;
        } else {
            pageNum = (int) json.get("pageNum");
        }
        if (StringUtils.isEmpty(json.get("pageSize"))) {
            pageSize = 5;
        } else {
            pageSize = (int) json.get("pageSize");
        }
        String username = "";
        Object obj = request.getSession().getAttribute("username");
        if (obj == null) {
            JSONObject object = new JSONObject();
            object.put("msg", "请先点击显示详情");
            return object;
        }
        if (request.getSession().getAttribute("username") != null) {
            username = request.getSession().getAttribute("username").toString();
        }
        String merchant_no = "";
        if (StringUtils.isEmpty(json.get("merchant_no"))) {
            merchant_no = "";
        } else {
            merchant_no = json.get("merchant_no").toString();
        }
        Integer id;
        if (StringUtils.isEmpty(json.get("number"))) {
            id = null;
        } else {
            id =  json.getInteger("number");
        }
        String out_trade_no = "";
        if (StringUtils.isEmpty(json.get("out_trade_no"))) {
            out_trade_no = "";
        } else {
            out_trade_no = json.get("out_trade_no").toString();
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Tradeserial> list = adminService.queryDetail(username, merchant_no, id, out_trade_no);
        List<PayDown> payList=new ArrayList<>();
        for (Tradeserial t : list) {
            PayDown payDown=new PayDown();
            payDown.setEndtime(t.getEndtime());
            payDown.setId(t.getId());
            payDown.setMerchantNo(t.getMerchantNo());
            payDown.setOutTradeNo(t.getOutTradeNo());
            payDown.setPayStatusCode(t.getPayStatusCode());
            payDown.setTotalFee(t.getTotalFee());
            payList.add(payDown);
        }
        String[] columnNames={"商户号","二维码编号","订单号","支付状态","支付金额","支付时间","失败原因"};
        String fileName = "payExcel";
        ExportExcelWrapper<PayDown> util = new ExportExcelWrapper<>();
        util.exportExcel(fileName, fileName, columnNames, payList, response, ExportExcelUtil.EXCEL_FILE_2003);
        return json;
    }


    @RequestMapping("/userList")
    public void downUser(HttpServletRequest request, HttpServletResponse response){
        // 准备数据
        List<AdminPlus> list = adminService.payList("");
        String[] columnNames = { "用户id", "用户名", " 计数","已处理数量","未处理数量","成功数量","失败数量"};
        String fileName = "userExcel";
        ExportExcelWrapper<AdminPlus> util = new ExportExcelWrapper<>();
        util.exportExcel(fileName, fileName, columnNames, list, response, ExportExcelUtil.EXCEL_FILE_2003);
    }
}
