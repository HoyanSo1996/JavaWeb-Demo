package com.omega.demo03.service;

import com.omega.demo03.pojo.User;

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
}
