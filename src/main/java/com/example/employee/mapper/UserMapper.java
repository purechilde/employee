package com.example.employee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.employee.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author lujiajun
 * @date 2023/3/28 21:09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> listAllUser();

    @Cacheable(sync = true)
    User selectUserById(int userId);

    @CacheEvict(key = "#p0.id")
    int updateById(@Param("et") User user);

}
