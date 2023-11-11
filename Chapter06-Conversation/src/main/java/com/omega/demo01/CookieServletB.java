package com.omega.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * Class CookieServlet
 *
 * @author KennySo
 * @date 2023/11/11
 */
@WebServlet("/servletB")
public class CookieServletB extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取cookie数组
        Cookie[] cookies = request.getCookies();
        // 2.遍历数组
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();
            if ("address".equals(name)) {
                value = URLDecoder.decode(value, "utf-8");
            }
            System.out.println(name + " : " + value);
        }
    }
}
