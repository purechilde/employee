package com.example.employee.service;

import com.example.employee.pojo.User;

/**
 * @author lujiajun
 * @date 2023/3/28 21:10
 */
public interface UserService  {


    User createUser(String userName,String fullName,String userPassword,String userConfirmPassword,String userEmail,String userPhone);


}
