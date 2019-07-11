package com.lcsw.background.mapper;

import com.lcsw.background.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {


    /**
     * 用户名登录
     *
     * @param username
     * @return
     */
    User loginByUsername(String username);

    /**
     * 邮箱登录
     *
     * @param email
     * @return
     */
    User loginByEmail(String email);


    /**
     * 手机号登录
     *
     * @param phone
     * @return
     */
    User loginByPhone(String phone);

    /**
     * 修改上次登录IP和时间
     *
     * @param ip
     * @param date
     */
    void updateIPAndDate(@Param("username") String username, @Param("lastip") String ip, @Param("lasttime") String date);
}