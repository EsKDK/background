package com.lcsw.background.util;


import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.IOException;


public class HttpClientUtil {
    //    private final static Logger logger = Logger.getLogger(String.valueOf(HttpClientUtil.class));
    private final static Logger logger = Logger
            .getLogger(HttpClientUtil.class);

    /**
     * post
     *
     * @param url
     * @param jsonStr
     * @return
     */
    public static String post(String url, String jsonStr) {

        String res = "";

        CloseableHttpClient httpclient = HttpClients.createDefault(); // 构建http请求

        try {
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");

            StringEntity enty = new StringEntity(jsonStr.toString(), "utf-8");
            httpPost.setEntity(enty);
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(60000)
                    .setConnectionRequestTimeout(60000).setSocketTimeout(60000)
                    .build();
            httpPost.setConfig(requestConfig);

            CloseableHttpResponse response = httpclient.execute(httpPost);
            try {
                HttpEntity entity = response.getEntity();


                if (entity != null) {
                    res = EntityUtils.toString(entity, "utf-8");
                    logger.info(res);

                }

                EntityUtils.consume(entity);
            } catch (IOException e) {
                e.printStackTrace();
                logger.error(e);
            } finally {
                response.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e);
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
                logger.error(e);
            }
        }

        return res;
    }
}
