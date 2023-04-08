package com.example.employee.service;

import com.example.employee.pojo.User;
import com.example.employee.utils.Result;
import org.springframework.stereotype.Service;

import java.util.List;

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
    User createUser(String userName,String fullName,String userPassword,String userConfirmPassword,String userEmail,Long userPhone);

    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    User queryUserByUserName(String userName);

    Result<List<User>> queryAllUser();
}
