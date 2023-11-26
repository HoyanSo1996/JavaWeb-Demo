package com.omega.brand.service;

import com.omega.brand.pojo.User;

/**
 * Class UserService
 *
 * @author KennySo
 * @date 2023/11/12
 */
public interface UserService {

    /**
     * 登录功能
     */
    User login(String username, String password);

    /**
     * 注册功能
     */
    Boolean register(User user);

    /**
     * 查询用户名是否被占用
     */
    User selectUserByUsername(String username);
}
