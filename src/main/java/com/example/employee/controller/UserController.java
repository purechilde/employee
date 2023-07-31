package com.example.employee.controller;

import com.example.employee.pojo.User;
import com.example.employee.service.UserService;
import com.example.employee.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.OK)
    public Result<List<User>> queryAllUser(){
        return userService.queryAllUser();
    }

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.OK)
    public Result createUser(
                             @RequestParam(value = "userName", required = false) String userName,
                             @RequestParam(value = "fullName", required = false) String fullName,
                             @RequestParam(value = "userPassword", required = false) String userPassword,
                             @RequestParam(value = "userEmail", required = false) String userEmail,
                             @RequestParam(value = "userPhone", required = false) Long userPhone){
        return userService.createUser(userName,fullName,userPassword,userEmail,userPhone);
    }

    @PostMapping(value = "/update")
    @ResponseStatus(HttpStatus.OK)
    public Result updateUser(
            @RequestParam(value = "userId", required = false) Integer userId,
            @RequestParam(value = "userName", required = false) String userName,
            @RequestParam(value = "fullName", required = false) String fullName,
            @RequestParam(value = "userEmail", required = false) String userEmail,
            @RequestParam(value = "userPhone", required = false) Long userPhone){
        return userService.updateUser(userId,userName,fullName,userEmail,userPhone);
    }

    @PostMapping(value = "/delete")
    @ResponseStatus(HttpStatus.OK)
    public Result deleteUser(
            @RequestParam(value = "userId", required = false) Integer userId){
        return userService.deleteUser(userId);
    }

}
