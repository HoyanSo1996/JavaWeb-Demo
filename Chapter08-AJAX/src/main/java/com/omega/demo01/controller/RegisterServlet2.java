package com.omega.demo01.controller;

import com.google.gson.Gson;
import com.omega.demo01.pojo.User;
import com.omega.demo01.service.UserService;
import com.omega.demo01.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class loginServlet
 *
 * @author KennySo
 * @date 2024/2/21
 */
@WebServlet("/register2")
public class RegisterServlet2 extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userInfo;
        User user = userService.getUserByName(request.getParameter("username"));
        if (user != null) {
            userInfo = new Gson().toJson(user);
        } else {
            // 这里不能返回空字符串, 因为前端的dataType设置为了json, 如果返回空字符串会回调异常函数
            // userInfo = "";
            userInfo = new Gson().toJson(new User(-1, "", "",""));
        }
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(userInfo);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
