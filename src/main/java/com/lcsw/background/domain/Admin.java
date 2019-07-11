package com.lcsw.background.domain;

import lombok.*;

/**
 * 用于管理员页面的查询
 *
 * @Author lmq
 **/

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Admin {

    /**
     * 用户id
     */
    private String matchingUserid;

    /**
     * 用户名
     */
    private String username;


    /**
     * 支付状态
     */
    private Byte payStatus;

    /**
     * 计数
     */
    private int count;


}
