package com.example.employee.service.impl;

import com.example.employee.pojo.User;
import com.example.employee.service.BaseService;

/**
 * @author lujiajun
 * @date 2023/3/28 21:47
 */
public class BaseServiceImpl implements BaseService {

    @Override
    public boolean isAdmin(User user) {
        return false;
    }

    @Override
    public boolean isNotAdmin(User user) {
        return false;
    }


}
