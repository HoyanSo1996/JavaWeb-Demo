package com.omega.demo01.service;

import com.omega.demo01.pojo.User;

/**
 * Class UserService
 *
 * @author KennySo
 * @date 2024/2/21
 */
public interface UserService {

    User getUserByName(String username);
}
