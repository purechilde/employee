package com.example.employee.controller;

import com.example.employee.pojo.User;
import com.example.employee.service.UserService;
import com.example.employee.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lujiajun
 * @date 2023/4/3 15:22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/list")
    public Result<List<User>> queryAllUser(){
        return userService.queryAllUser();
    }


}
