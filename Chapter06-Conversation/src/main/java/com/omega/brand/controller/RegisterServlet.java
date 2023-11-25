package com.omega.brand.controller;

import com.omega.brand.pojo.User;
import com.omega.brand.service.UserService;
import com.omega.brand.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Class RegisterServlet
 *
 * @author KennySo
 * @date 2023/11/13
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        String verificationCode = request.getParameter("verificationCode");

        // 1.判断验证码是否通过
        HttpSession session = request.getSession();
        String verificationCodeGen = (String) session.getAttribute("verificationCodeGen");
        if (!verificationCodeGen.equalsIgnoreCase(verificationCode)) {
            request.setAttribute("register_msg", "验证码错误");
            request.getRequestDispatcher("/brandUi/register.jsp").forward(request, response);
            // 不允许注册
            return;
        }

        // 2.判断注册成功与否
        Boolean flag = userService.register(user);
        if (flag) {
            // 注册功能，跳转登陆页面
            request.setAttribute("register_msg", "注册成功，请登录");
            request.getRequestDispatcher("/brandUi/login.jsp").forward(request, response);
        } else {
            // 注册失败，跳转到注册页面
            request.setAttribute("register_msg", "用户名已存在");
            request.getRequestDispatcher("/brandUi/register.jsp").forward(request, response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
