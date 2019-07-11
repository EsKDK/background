package com.lcsw.background.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 登出
 */
@RestController
public class LoginOutController {
    @RequestMapping("loginOut")
    public void loginOut(HttpServletRequest request , HttpServletResponse response) throws IOException {
        //清除session
        Enumeration em = request.getSession().getAttributeNames();
        while(em.hasMoreElements()){
            request.getSession().removeAttribute(em.nextElement().toString());
        }
    }
}
