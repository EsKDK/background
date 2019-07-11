package com.lcsw.background.controller;

import com.alibaba.fastjson.JSONObject;
import com.lcsw.background.service.QueryResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 查询支付
 */
@RestController
public class QueryResultController {
    @Autowired
    QueryResultService queryResultService;

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/queryResult")
    public JSONObject queryResult() {
        JSONObject object = new JSONObject();
        String merchantid = "";
        Object obj= request.getSession().getAttribute("merchantid");
        if (obj==null){
            object.put("msg","请先登录!");
            return object;
        }
        if (request.getSession().getAttribute("merchantid")!=null){
            merchantid = request.getSession().getAttribute("merchantid").toString();
            String result = queryResultService.QueryResult(merchantid);
            object.put("result", result);
        }
        return object;
    }
}
