package com.omega.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class RequestAPI
 *
 * @author KennySo
 * @date 2023/10/22
 */
@WebServlet("/request/header")
public class RequestHeaderAPIs extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取 请求头信息
        String user_agent = request.getHeader("user-agent");
        System.out.println("浏览器版本信息: " + user_agent);
    }
}
