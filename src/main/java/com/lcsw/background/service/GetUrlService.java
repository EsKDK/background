package com.lcsw.background.service;

import com.alibaba.fastjson.JSONObject;

import java.io.UnsupportedEncodingException;

/**
 * 获取支付erl
 */
public interface GetUrlService {
     JSONObject getUrl(Integer integer) throws UnsupportedEncodingException;

     String queryRemainCode(Integer integer);

     String queryAllCode(Integer integer);
}
