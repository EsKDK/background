package com.lcsw.background.service.impl;

import com.lcsw.background.domain.User;
import com.lcsw.background.mapper.UserMapper;
import com.lcsw.background.service.LoginService;
import com.lcsw.background.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    HttpServletRequest request;

    @Override
    public User login(String username, String password) {
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String ph = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
        User user = new User();
        if (username != null) {
            password = MD5.MD5Encode(password);
            try {
                if (username.matches(em)) {//正则验证是否为邮箱
                    User user2 = userMapper.loginByEmail(username);

                    if (user2 != null) {
                        if (password.equals(user2.getPassword())) {
                            request.getSession(true).setAttribute("user", user2);
                            user = user2;
                        }
                    }

                } else if (username.matches(ph)) {//正则验证为纯数字 手机号
                    User user2 = userMapper.loginByPhone(username);
                    if (user2 != null) {
                        if (password.equals(user2.getPassword())) {
                            request.getSession(true).setAttribute("user", user2);
                            user = user2;
                        }
                    }

                } else {//用户名登陆
                    User user2 = userMapper.loginByUsername(username);
                    if (user2 != null) {
                        if (user2.getPassword() != null) {
                            if (password.equals(user2.getPassword())) {
                                request.getSession(true).setAttribute("user", user2);
                                user = user2;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //返回user对象 为空则证明没有查到
        return user;
    }

    /**
     * 修改上次登录时间 ip
     *
     * @param ip
     * @param date
     */
    @Override
    public void updateIPAndDate(String username, String ip, String date) {
        //调用修改的方法
        userMapper.updateIPAndDate(username, ip, date);
    }
}
