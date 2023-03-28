package com.example.employee.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author lujiajun
 * @date 2023/3/27 16:26
 */
@Data
public class User {

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    private String userEmail;

    private String userPhone;


    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}
