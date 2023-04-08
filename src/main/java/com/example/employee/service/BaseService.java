package com.example.employee.service;

import com.example.employee.pojo.User;

/**
 * @author lujiajun
 * @date 2023/3/28 21:46
 */
public interface BaseService {

    /**
     * check admin
     * @param user
     * @return ture if administrator, otherwise return false
     */
    boolean isAdmin(User user);

    /**
     * isNotAdmin
     * @param user
     * @return
     */
    boolean isNotAdmin(User user);
}
