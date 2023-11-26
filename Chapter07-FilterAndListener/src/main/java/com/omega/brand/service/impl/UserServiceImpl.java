package com.omega.brand.service.impl;

import com.omega.brand.mapper.UserMapper;
import com.omega.brand.mapper.impl.UserMapperImpl;
import com.omega.brand.pojo.User;
import com.omega.brand.service.UserService;

/**
 * Class UserServiceImpl
 *
 * @author KennySo
 * @date 2023/11/12
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper = new UserMapperImpl();

    @Override
    public User login(String username, String password) {
        return userMapper.selectOne(username, password);
    }


    @Override
    public Boolean register(User user) {
        User realUser = userMapper.selectByUsername(user.getUsername());
        if (realUser == null) {
            // 用户名不存在, 添加新用户
            userMapper.insertOne(user);
            return true;
        }
        return false;
    }
}
