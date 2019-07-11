package com.lcsw.background.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lcsw.background.domain.Merchant;
import com.lcsw.background.mapper.MerchantMapper;
import com.lcsw.background.service.GetUrlService;
import com.lcsw.background.util.HttpClientUtil;
import com.lcsw.background.util.MD5;
import com.lcsw.background.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class GetUrlServiceImpl implements GetUrlService {
    @Autowired
    MerchantMapper merchantMapper;
    @Autowired
    HttpServletRequest request;

    @Override
    public JSONObject getUrl(Integer integer) {
        Merchant merchant = merchantMapper.getUrl(integer);
        request.getSession(true).setAttribute("merchantid",merchant.getMerchantid() );
        Map<String, String> map = new HashMap<>();
        //商户号
        map.put("merchant_no", merchant.getMerchantno());
        //终端号
        map.put("terminal_id", merchant.getTerminalno());
        //令牌
        map.put("access_token", merchant.getToken());
        //版本号
        map.put("pay_ver", "110");
        //请求类型
        map.put("pay_type", "000");
        //接口类型
        map.put("service_id", "016");

        //终端流水号
        String terminal_trace = UuidUtil.uuid()+merchant.getMerchantid();
        map.put("terminal_trace", terminal_trace);
        //终端交易时间
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String format = dateFormat.format(date);
        map.put("terminal_time", format);
        //金额
        map.put("total_fee", "1");
        //外部系统通知地址
        String encode = "http://192.168.1.136:8080/notifyUrl";

        map.put("notify_url", encode);
        //签名字符串拼接
        String str = "merchant_no=" + merchant.getMerchantno()
                + "&notify_url=" + encode
                + "&pay_type=000"
                + "&pay_ver=110"
                + "&service_id=016"
                + "&terminal_id=" + merchant.getTerminalno()
                + "&terminal_time=" + format
                + "&terminal_trace=" + terminal_trace
                + "&total_fee=1"
                + "&access_token=" + merchant.getToken();
        String key_sign = MD5.sign(str, "UTF-8");
        map.put("key_sign", key_sign);
/*        StringBuffer buffer = new StringBuffer("http://test.lcsw.cn:8045/lcsw/open/wap/110/pay?");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            buffer.append(key + "=" + value + "&");
        }
        String qr_code = buffer.deleteCharAt(buffer.length() - 1).toString();*/
        String s = HttpClientUtil.post("http://test.lcsw.cn:8045/lcsw/pay/110/qrpay", JSON.toJSONString(map));
        JSONObject jsonObject = JSON.parseObject(s);
        Object qrUrl = jsonObject.get("qr_url");
        String qr_code ="";
        if (qrUrl!=null){
            qr_code=qrUrl.toString();
        }else {
            qr_code="异常";
        }
        JSONObject object=new JSONObject();
        object.put("url",qr_code);
        object.put("id",merchant.getId());
        return object;
    }

    /**
     *查询当前用户剩余未处理数量
     * @param integer
     * @return
     */
    @Override
    public String queryRemainCode(Integer integer) {
        int i = merchantMapper.queryRemainCode(integer);
        return i + "";
    }

    /**
     * 查询当前用户的所有二维码数量
     * @param integer
     * @return
     */
    @Override
    public String queryAllCode(Integer integer) {
        int i=merchantMapper.queryAllCode(integer);
        return i+"";
    }
}
