package com.example.employee.service;

import com.example.employee.pojo.User;
import com.example.employee.utils.Result;

import java.util.List;

/**
 * @author lujiajun
 * @date 2023/3/28 21:10
 */

public interface UserService  {

    /**
     * 创建用户
     *
     * @param userName
     * @param fullName
     * @param userPassword
     * @param userEmail
     * @param userPhone
     * @return
     */
    Result<User> createUser(String userName,String fullName,String userPassword,String userEmail,Long userPhone);

    /**
     * 返回所有用户
     */
    Result<List<User>> queryAllUser();

    /**
     * 修改用户
     * @param userName
     * @param fullName
     * @param userEmail
     * @param userPhone
     */
    Result<User> updateUser(Integer userId,String userName,String fullName,String userEmail,Long userPhone);

    /**
     * 删除用户
     * @param userId
     */
    Result deleteUser(Integer userId);

    /**
     * 根据用户名查询用户
     * @param userName
     */
    Result<User> queryUserByUserName(String userName);

    /**
     * 根据用户名模糊查询用户
     * @param userName
     */
    Result<List<User>> fuzzyQueryUserByUserName(String userName);

}
