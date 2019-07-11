package com.lcsw.background.service.impl;

import com.lcsw.background.mapper.TradeserialMapper;
import com.lcsw.background.service.QueryResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Service
public class QueryResultServiceImpl implements QueryResultService {
    @Autowired
    HttpServletRequest request;
    @Autowired
    TradeserialMapper tradeserialMapper;

    @Override
    public String QueryResult(String merchantid) {
        Integer pay_status_code = tradeserialMapper.queyPayCode(Integer.valueOf(merchantid));
//        while (!(pay_status_code != null)) {
//            pay_status_code = tradeserialMapper.queyPayCode(Integer.valueOf(merchantid));
//
//        }
        if (StringUtils.isEmpty(pay_status_code)){
            return "0";
        }else  if ("1".equals(pay_status_code.toString())) {
            return "1";
        }  if ("2".equals(pay_status_code.toString())) {
            return "2";
        }
      return "0";
    }
}

