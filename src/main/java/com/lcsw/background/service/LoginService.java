package com.lcsw.background.service;

import com.lcsw.background.domain.User;

public interface LoginService {
    User login(String username, String password);

    void updateIPAndDate(String username, String ip, String date);
}
