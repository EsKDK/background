package com.lcsw.background.domain;

import java.io.Serializable;

public class UserPayStauCount implements Serializable {

    private String username;

    private int userId;

    private int payStatus;

    private int payCount;

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

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    public int getPayCount() {
        return payCount;
    }

    public void setPayCount(int payCount) {
        this.payCount = payCount;
    }

    @Override
    public String toString() {
        return "UserPayStauCount{" +
                "username='" + username + '\'' +
                ", userId=" + userId +
                ", payStatus=" + payStatus +
                ", payCount=" + payCount +
                '}';
    }
}
