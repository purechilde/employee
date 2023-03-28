package com.example.employee.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author lujiajun
 * @date 2023/3/27 16:26
 */
@Data
@TableName()
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
     * 姓名
     */
    private String fullName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户邮件
     */
    private String userEmail;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * 用户创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
