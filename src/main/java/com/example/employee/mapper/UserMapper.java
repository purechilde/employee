package com.example.employee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.employee.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author lujiajun
 * @date 2023/3/28 21:09
 */
public interface UserMapper extends BaseMapper<User> {

    User queryUserByUserNameAccurately(@Param("userName") String userName);


}
