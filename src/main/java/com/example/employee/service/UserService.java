package com.example.employee.service;

import com.example.employee.pojo.User;

/**
 * @author lujiajun
 * @date 2023/3/28 21:10
 */
public interface UserService  {


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
    User createUser(String userName,String fullName,String userPassword,String userConfirmPassword,String userEmail,String userPhone);

    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    User queryUserByUserName(String userName);
}
