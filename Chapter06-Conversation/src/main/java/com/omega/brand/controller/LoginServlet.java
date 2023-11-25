package com.omega.brand.controller;

import com.omega.brand.pojo.User;
import com.omega.brand.service.UserService;
import com.omega.brand.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Class LoginServlet
 *
 * @author KennySo
 * @date 2023/11/12
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");

        User user = userService.login(username, password);

        if (user != null) {
            // 登录成功
            // 1.将登陆成功后的user对象，存储到session
            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            // 2.判断是否有勾选"记住我"选项
            if ("1".equals(remember)) {
                // 勾选了，发送Cookie
                // 创建Cookie对象
                Cookie c_username = new Cookie("username",username);
                Cookie c_password = new Cookie("password",password);
                // 设置Cookie的存活时间
                c_username.setMaxAge( 60 * 60 * 24 * 7);
                c_password.setMaxAge( 60 * 60 * 24 * 7);
                // 发送
                response.addCookie(c_username);
                response.addCookie(c_password);
            }

            // 3.跳转到查询所有的BrandServlet
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath + "/brand/selectAll");

        } else {
            // 登录失败
            // 存储错误信息到request, 如果存入到session中就会出现这次会话的所有请求都有登录失败的错误信息, 这个是不需要的, 所以不用存入到session中
            request.setAttribute("login_msg", "用户名或密码错误");
            // 跳转到login.jsp
            request.getRequestDispatcher("/brandUi/login.jsp").forward(request, response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}