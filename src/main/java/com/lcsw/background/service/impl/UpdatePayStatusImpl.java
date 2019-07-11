package com.lcsw.background.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.lcsw.background.domain.Tradeserial;
import com.lcsw.background.mapper.MerchantMapper;
import com.lcsw.background.mapper.TradeserialMapper;
import com.lcsw.background.service.UpdatePayStatus;
import com.lcsw.background.util.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UpdatePayStatusImpl implements UpdatePayStatus {
    @Autowired
    HttpServletRequest request;

    @Autowired
    private MerchantMapper merchantMapper;
    @Autowired
    private TradeserialMapper tradeserialMapper;

    @Override
    public void updatePayStatus(String jsonString) {

        //将字符串转化为json对象
        JSONObject json = null;
        try {
            json = (JSONObject) JSONObject.parse(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //获取result_code
        String result_code = null;

        try {
            result_code = json.get("result_code").toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String merchantid;
        merchantid =json.getString("terminal_trace");
        merchantid=   merchantid.substring(merchantid.length()-5);
        if ("01".equals(result_code)) {
            //支付成功
            merchantMapper.updatePayStatus(Integer.valueOf(merchantid), 1,"支付成功");
        } else if ("02".equals(result_code)) {
            //支付失败
            merchantMapper.updatePayStatus(Integer.valueOf(merchantid), 2,"支付失败");
        }

    }


    @Override
    public void insertPay(String jsonString) {
        Tradeserial tradeserial = new Tradeserial();
        JSONObject json = null;
        try {
            json = (JSONObject) JSONObject.parse(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (json != null) {
            if (json != null) {
                String merchantid;
                merchantid =json.getString("terminal_trace");
                merchantid=   merchantid.substring(merchantid.length()-5);
                String merchant_no = json.getString("merchant_no");
                String terminalno = json.getString("terminal_id");
                String createtime = json.getString("terminal_time");
                String createdate = demo.getDateByReg(createtime);
                String out_trade_no = json.getString("out_trade_no");
                String total_fee = json.getString("total_fee");
                String pay_status_code = json.getString("result_code");
                String pay_status_msg =json.getString("return_msg");
                String endtime = json.getString("end_time");
                //调用插入账单接口
                tradeserialMapper.insert(merchantid, merchant_no, terminalno, createtime, createdate, out_trade_no, total_fee, pay_status_code, pay_status_msg, endtime);
            }
        }
    }
}
