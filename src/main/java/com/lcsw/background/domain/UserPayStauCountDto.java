package com.lcsw.background.domain;

import java.io.Serializable;

public class UserPayStauCountDto implements Serializable {

    //账号名称
    private String username;

    //账号
    private int userId;

    //未处理总数
    private int notPayCount;

    //支付成功总数
    private int paySuccessCount;

    //支付失败总数
    private int payFailCount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getNotPayCount() {
        return notPayCount;
    }

    public void setNotPayCount(int notPayCount) {
        this.notPayCount = notPayCount;
    }

    public int getPaySuccessCount() {
        return paySuccessCount;
    }

    public void setPaySuccessCount(int paySuccessCount) {
        this.paySuccessCount = paySuccessCount;
    }

    public int getPayFailCount() {
        return payFailCount;
    }

    public void setPayFailCount(int payFailCount) {
        this.payFailCount = payFailCount;
    }

    @Override
    public String toString() {
        return "UserPayStauCountDto{" +
                "username='" + username + '\'' +
                ", userId=" + userId +
                ", notPayCount=" + notPayCount +
                ", paySuccessCount=" + paySuccessCount +
                ", payFailCount=" + payFailCount +
                '}';
    }
}