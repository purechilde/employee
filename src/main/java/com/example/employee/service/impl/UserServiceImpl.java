package com.example.employee.service.impl;


import com.example.employee.pojo.User;
import com.example.employee.service.UserService;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author lujiajun
 * @date 2023/3/28 21:46
 */
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(String userName,
                           String fullName,
                           String userPassword,
                           String userConfirmPassword,
                           String userEmail,
                           String userPhone) {
        User user = new User();
        LocalDateTime now = LocalDateTime.now();
        user.setUserName(userName);
        user.setFullName(fullName);
        if(userPassword.equals(userConfirmPassword))
            user.setUserPassword(userPassword);
        user.setUserEmail(userEmail);
        user.setUserPhone(userPhone);
        user.setCreateTime(now);
        user.setUpdateTime(now);


        return null;
    }
}
