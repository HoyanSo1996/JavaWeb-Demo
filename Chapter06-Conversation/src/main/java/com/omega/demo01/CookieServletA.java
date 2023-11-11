package com.omega.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Class CookieServlet
 *
 * @author KennySo
 * @date 2023/11/11
 */
@WebServlet("/servletA")
public class CookieServletA extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.创建cookie对象
        Cookie cookie = new Cookie("username", "Kenny");

        // 设置cookie过期时间
        // cookie.setMaxAge(604800);   //不易阅读(可以使用注解弥补)，程序少进行一次计算
        cookie.setMaxAge(7*24*60*60);  //易阅读，需程序计算

        // 存储中文
        String address = URLEncoder.encode("中国广东省", "utf-8");
        Cookie cookie2 = new Cookie("address", address);

        // 2.将cookie发送给前端
        response.addCookie(cookie);
        response.addCookie(cookie2);
    }
}
