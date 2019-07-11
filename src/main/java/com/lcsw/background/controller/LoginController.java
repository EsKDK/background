package com.lcsw.background.controller;


import com.alibaba.fastjson.JSONObject;
import com.lcsw.background.domain.User;
import com.lcsw.background.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 登陆
 */
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    HttpServletRequest request;

    @RequestMapping("/login")
    public JSONObject login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        User user = new User();
        user = loginService.login(username, password);
        JSONObject json = new JSONObject();
        if (user.getType() != null) {
            //修改上次登录ip 时间
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = dateFormat.format(date);
            HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String ip = req.getRemoteAddr();
            loginService.updateIPAndDate(username, ip, format);
            //返回user对象
            if ("1".equals(user.getType().toString()) | "0".equals(user.getType().toString())) {
                json.put("msg", "登录成功");
                json.put("code", "200");
                JSONObject object = new JSONObject();
                object.put("username", user.getUsername());
                object.put("type", user.getType());
                object.put("ip", user.getLastip());
                object.put("time", user.getLasttime());
                json.put("user", object);
                return json;
            }
        }
        json.put("msg", "登录失败");
        json.put("code", "0");
        return json;
    }

}
