package com.omega.demo07;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class ServletContextDemo
 *
 * @author KennySo
 * @date 2023/12/5
 */
@WebServlet("/demo07")
public class ServletContextDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取ServletContext对象
        // 方式一：
        ServletContext servletContext_1 = getServletConfig().getServletContext();
        // 方式二:
        ServletContext servletContext_2 = getServletContext();

        // 2.获取context-param
        String website = servletContext_1.getInitParameter("website");
        String author = servletContext_2.getInitParameter("author");
        System.out.println("website: " + website);
        System.out.println("author: " + author);

        // 3.获取工程路径(访问路径)
        String contextPath = servletContext_1.getContextPath();
        System.out.println("访问路径: " + contextPath);

        // 4.获取工程部署在服务器硬盘上的绝对路径
        String realPath = servletContext_1.getRealPath("/");
        System.out.println("项目发布后的绝对路径: " + realPath);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
