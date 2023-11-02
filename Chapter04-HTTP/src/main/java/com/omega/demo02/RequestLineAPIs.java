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
@WebServlet("/request/line")
public class RequestLineAPIs extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取 请求方式
        String method = request.getMethod();
        System.out.println("请求方式: " + method);

        // 2.获取 目录访问路径
        String contextPath = request.getContextPath();
        System.out.println("目录访问路径: " + contextPath);

        // 3.获取 URI (统一资源标识符)
        String requestURI = request.getRequestURI();
        System.out.println("统一资源标识符: " + requestURI);

        // 4.获取 URL (统一资源定位符)
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("统一资源资源符: " + requestURL.toString());

        // 5.获取 请求参数
        String queryString = request.getQueryString();
        System.out.println("请求参数: " + queryString);

    }
}
