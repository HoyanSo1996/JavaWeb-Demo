package com.omega.demo02.controller;

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
 * @date 2023/11/18
 */
@WebServlet("/selectUsername")
public class SelectUsernameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 验证用户名是否被占用
        String username = request.getParameter("username");
        if ("张三".equalsIgnoreCase(username)) {
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
