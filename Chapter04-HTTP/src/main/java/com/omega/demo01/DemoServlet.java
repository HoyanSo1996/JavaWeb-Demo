package com.omega.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class DemoServlet
 *
 * @author KennySo
 * @date 2023/10/22
 */
@WebServlet(urlPatterns = "/demo1")
public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 从request对象中获取请求数据
        String name = req.getParameter("username");  // user?name=zhangsan
        System.out.println("name = " + name);

        // 使用response对象设置响应数据
        resp.setHeader("content-type","text/html;charset=utf-8");
        resp.getWriter().write("<h1>" + name + ", 欢迎您！</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post...");
    }
}
