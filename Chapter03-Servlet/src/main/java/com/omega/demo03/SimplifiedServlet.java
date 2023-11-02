package com.omega.demo03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class SimplifiedServlet
 *
 * @author KennySo
 * @date 2023/10/21
 */
@WebServlet("/demo3")
public class SimplifiedServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO  GET请求方式处理逻辑
        System.out.println("get...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO  Post请求方式处理逻辑
        System.out.println("post...");
    }
}
