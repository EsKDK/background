package com.lcsw.background.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lcsw.background.domain.AdminPlus;
import com.lcsw.background.domain.Tradeserial;
import com.lcsw.background.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 管理员
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    HttpServletRequest request;

    /**
     * 管理员条件查询
     *
     * @param
     * @return
     */
    @RequestMapping("/queryList")
    @ResponseBody
    public JSONObject queryList(@RequestBody(required = false) String json1) {
        JSONObject object = new JSONObject();
        if (json1 == null || json1 == "") {
            List<AdminPlus> list = adminService.payList("");
            object.put("list", list);
            return object;
        }
        JSONObject json = null;
        try {
            json = (JSONObject) JSONObject.parse(json1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String username = "";
        if (StringUtils.isEmpty(json.get("username"))) {
            username = "";
        } else {
            username = json.get("username").toString();
        }

        int pageNum;
        int pageSize;
        if (StringUtils.isEmpty(json.get("pageNum"))) {
            List<AdminPlus> list = adminService.payList(username);
            object.put("list", list);
            return object;
        } else {
            pageNum = (int) json.get("pageNum");
        }
        if (StringUtils.isEmpty(json.get("pageSize"))) {
            List<AdminPlus> list = adminService.payList(username);
            object.put("list", list);
            return object;
        } else {
            pageSize = (int) json.get("pageSize");
        }
        PageHelper.startPage(pageNum, pageSize);
        List<AdminPlus> list = adminService.payList(username);
        PageInfo<AdminPlus> pageInfo = new PageInfo<>(list);
        object.put("pageInfo", pageInfo);
        return object;
    }


    /**
     * 管理员页面查询详情
     */
    @RequestMapping("/queryDetails")
    public JSONObject queryDetails(@RequestBody(required = false) String json1) {
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
                return null;
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
            PageInfo<Tradeserial> pageInfo = new PageInfo<>(list);
            JSONObject object = new JSONObject();
            object.put("pageInfo", pageInfo);
            return object;

    }




    /*  */

    /**
     * 管理员页面查询详情
     *//*
    @RequestMapping("/queryDetails")
    public JSONObject queryDetails(@RequestBody(required = false) String json1) {
        if (json1==null||json1==""){
            PageHelper.startPage(1, 5);
            List<Tradeserial> list = adminService.queryDetail("", "", "");
            PageInfo<Tradeserial> pageInfo = new PageInfo<>(list);
            JSONObject object = new JSONObject();
            object.put("pageInfo", pageInfo);
            return object;
        }
        JSONObject json = null;
        try {
            json = (JSONObject) JSONObject.parse(json1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int pageNum;
        int pageSize;
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

        String merchant_no="";
        if (StringUtils.isEmpty(json.get("merchant_no"))) {
            merchant_no = "";
        } else {
            merchant_no = json.get("merchant_no").toString();
        }

        String queryStartTime="";
        if (StringUtils.isEmpty(json.get("queryStartTime"))) {
            queryStartTime = "";
        } else {
            queryStartTime = json.get("queryStartTime").toString();
        }
        String queryEndTime="";
        if (StringUtils.isEmpty(json.get("queryEndTime"))) {
            queryEndTime = "";
        } else {
            queryEndTime = json.get("queryEndTime").toString();
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Tradeserial> list = adminService.queryDetail(merchant_no, queryStartTime, queryEndTime);
        PageInfo<Tradeserial> pageInfo = new PageInfo<>(list);
        JSONObject object = new JSONObject();
        object.put("pageInfo", pageInfo);
        return object;
    }*/

    /**
     * 点击详情按钮展示订单列表
     * @param json1
     * @return
     */
    @RequestMapping("/payDetails")
    public JSONObject payDetails(@RequestBody(required = false) String json1) {
        JSONObject object = new JSONObject();
        if (json1 == null || json1 == "") {
            object.put("msg", "缺少参数");
            return object;
        }
        JSONObject json = null;
        try {
            json = (JSONObject) JSONObject.parse(json1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String username = "";
        if (json.getString("username") != null) {
            username = json.getString("username");
        }
        request.getSession(true).setAttribute("username", username);
        int pageNum;
        int pageSize;
        if (StringUtils.isEmpty(json.get("pageNum"))) {
            List<Tradeserial> list = adminService.payDetails(username);
            object.put("list", list);
            return object;
        } else {
            pageNum = (int) json.get("pageNum");
        }
        if (StringUtils.isEmpty(json.get("pageSize"))) {
            List<Tradeserial> list = adminService.payDetails(username);
            object.put("list", list);
            return object;
        } else {
            pageSize = (int) json.get("pageSize");
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Tradeserial> list = adminService.payDetails(username);
        PageInfo<Tradeserial> pageInfo = new PageInfo<>(list);
        object.put("pageInfo", pageInfo);
        return object;
    }

   /* @RequestMapping("/findCount")
    @ResponseBody
    public JSONObject findCount(@RequestBody(required = false) MerchantParam merchantParam, HttpSession session) {
        JSONObject object=new JSONObject();
        PageInfo pageInfo = null;
        String pattern = "^([1-9][0-9]{0,9})$";
        if (StringUtils.isEmpty(merchantParam.getUserId())) {
            List<Integer> ids = adminService.findUserId(merchantParam);
            pageInfo = new PageInfo(ids);
            List list = pageInfo.getList();
            merchantParam.setList(list);
        } else if (Pattern.matches(pattern, merchantParam.getUserId())) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(Integer.parseInt(merchantParam.getUserId()));
            merchantParam.setList(list);
        } else {
            object.put("msg","userId格式错误");
            return object;
        }
        List<UserPayStauCountDto> countList = adminService.findByuserIdsAndTime(merchantParam);
        if (countList == null || countList.size() == 0) {
            object.put("msg","没查到数据");
            return object;
        }
        if (pageInfo != null) {
            object.put("list",countList);
            object.put("pageNum", pageInfo.getPageNum());
            object.put("pages",pageInfo.getPages());
            object.put("total", pageInfo.getTotal());
            return  object;
        } else {
           object.put("list",countList);
            object.put("pageNum", "1");
            object.put("pages","1");
            object.put("total", "1");

            return object;
        }
    }*/

}

