package com.example.employee.service.impl;


import com.example.employee.mapper.UserMapper;
import com.example.employee.pojo.User;
import com.example.employee.service.UserService;
import com.example.employee.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author lujiajun
 * @date 2023/3/28 21:46
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 创建用户
     * @param userName
     * @param fullName
     * @param userPassword
     * @param userConfirmPassword
     * @param userEmail
     * @param userPhone
     * @return
     */
    @Override
    public User createUser(String userName,
                           String fullName,
                           String userPassword,
                           String userConfirmPassword,
                           String userEmail,
                           Long userPhone) {
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
        userMapper.insert(user);
        return user;
    }

    @Override
    public User queryUserByUserName(String userName) {
        return userMapper.queryUserByUserNameAccurately(userName);
    }

    @Override
    public Result<List<User>> queryAllUser() {
        List<User> list = userMapper.listAllUser();
        return Result.ok(list);
    }


}
