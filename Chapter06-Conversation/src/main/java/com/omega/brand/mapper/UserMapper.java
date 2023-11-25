package com.omega.brand.mapper;

import com.omega.brand.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Class UserMapper
 *
 * @author KennySo
 * @date 2023/11/12
 */
public interface UserMapper {

    /**
     * 根据用户名和密码查询用户对象
     */
    User selectOne(@Param("username") String username, @Param("password")  String password);

    /**
     * 根据用户名查询用户对象
     */
    User selectByUsername(String username);

    /**
     * 添加用户
     */
    Integer insertOne(User user);
}
