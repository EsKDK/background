package com.lcsw.background.controller;

import com.alibaba.fastjson.JSONObject;
import com.lcsw.background.service.UpdatePayStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息回调
 */
@RestController
public class NotifyUrlController {
    @Autowired
    private UpdatePayStatus updatePayStatus;

    @RequestMapping("/notifyUrl")
    public JSONObject getResult(@RequestBody String jsonString) {
        updatePayStatus.updatePayStatus(jsonString);//修改test_merchant_uni的 pay_status
        updatePayStatus.insertPay(jsonString);  //插入订单记录
        JSONObject json = null;
        try {
            json = (JSONObject) JSONObject.parse(jsonString);
        } catch (Exception e) {
        }
        String result_code = json.get("result_code").toString();
        if ("01".equals(result_code)) {
            json.put("return_code", "01");
            json.put("return_msg", "success");
        }else{
            json.put("return_code", "02");
            json.put("return_msg", "fail");
        }
        return json;
    }
}
