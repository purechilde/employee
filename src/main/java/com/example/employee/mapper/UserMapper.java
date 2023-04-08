package com.example.employee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.employee.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lujiajun
 * @date 2023/3/28 21:09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User queryUserByUserNameAccurately(@Param("userName") String userName);

    List<User> listAllUser();

}
