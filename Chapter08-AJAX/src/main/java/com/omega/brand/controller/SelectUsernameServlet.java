package com.omega.brand.controller;

import com.omega.brand.pojo.User;
import com.omega.brand.service.UserService;
import com.omega.brand.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class SelectUsernameServlet
 *
 * @author KennySo
 * @date 2023/11/26
 */
@WebServlet("/selectUsername")
public class SelectUsernameServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 验证用户名是否被占用
        String username = request.getParameter("username");
        User user = userService.selectUserByUsername(username);

        if (user != null) {
            // 发送响应信息
            response.getWriter().write("" + true);
        } else {
            response.getWriter().write("" + false);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}