package com.omega.demo01.service.impl;

import com.omega.demo01.mapper.UserDAO;
import com.omega.demo01.pojo.User;
import com.omega.demo01.service.UserService;

/**
 * Class UserServiceImpl
 *
 * @author KennySo
 * @date 2024/2/21
 */
public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAO();

    @Override
    public User getUserByName(String username) {
        String sql = "select * from user where username = ?";
        return  userDAO.querySingle(sql, User.class, username.toLowerCase());
    }

}
