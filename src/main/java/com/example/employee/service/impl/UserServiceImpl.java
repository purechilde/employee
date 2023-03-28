package com.example.employee.service.impl;


import com.example.employee.pojo.User;
import com.example.employee.service.UserService;

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
        user.setUserName(userName);
        user.setFullName(fullName);
        if()
        user.setUserEmail(userEmail);
        user.setUserPhone(userPhone);



        return null;
    }
}
