package com.example.employee.service.impl;


import com.example.employee.code.UserErrorCode;
import com.example.employee.mapper.UserMapper;
import com.example.employee.pojo.User;
import com.example.employee.service.UserService;
import com.example.employee.utils.EncryptionUtils;
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
     * @param userEmail
     * @param userPhone
     */
    @Override
    public Result<User> createUser(String userName,
                           String fullName,
                           String userPassword,
                           String userEmail,
                           Long userPhone) {
        User user = new User();
        LocalDateTime now = LocalDateTime.now();
        user.setUserName(userName);
        user.setFullName(fullName);
        user.setUserPassword(EncryptionUtils.getMd5(userPassword));
        user.setUserEmail(userEmail);
        user.setUserPhone(userPhone);
        user.setCreateTime(now);
        user.setUpdateTime(now);
        userMapper.insert(user);
        return Result.ok(user);
    }

    @Override
    public Result<List<User>> queryAllUser() {
        List<User> list = userMapper.listAllUser();
        return Result.ok(list);
    }

    @Override
    public Result<User> updateUser(Integer userId,
                                   String userName,
                                   String fullName,
                                   String userEmail,
                                   Long userPhone) {
        User user = userMapper.selectUserById(userId);
        if(user == null){
           return Result.error(UserErrorCode.USER_NOT_EXIST);
        }
        user.setUserName(userName);
        user.setFullName(fullName);
        user.setUserEmail(userEmail);
        user.setUserPhone(userPhone);
        LocalDateTime now = LocalDateTime.now();
        user.setUpdateTime(now);
        userMapper.updateById(user);
        return Result.ok(user);
    }

    @Override
    public Result deleteUser(Integer userId) {
        User user = userMapper.selectUserById(userId);
        if(user == null){
            return Result.error(UserErrorCode.USER_NOT_EXIST);
        }
        userMapper.deleteById(userId);
        return Result.ok();
    }

    @Override
    public Result<User> queryUserByUserName(String userName) {
        User user = userMapper.selectUserByUserName(userName);
        if(user == null){
            return Result.error(UserErrorCode.USER_NOT_EXIST);
        }
        return Result.ok(user);
    }

    @Override
    public Result<List<User>> fuzzyQueryUserByUserName(String userName) {
        List<User> user = userMapper.FuzzyQueryUserByUserName(userName);
        if(user.isEmpty()){
            return Result.error(UserErrorCode.USER_NOT_EXIST);
        }
        return Result.ok(user);
    }


}
