package com.omega.demo04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class ResourceA2
 *
 * @author KennySu
 * @date 2023/11/2
 */
@WebServlet("/resourceA2")
public class ResourceA2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ResourceA2....");
        // 方法1：
        // 1.设置响应状态码
        // response.setStatus(302);
        // 2.设置响应头 locations
        // response.setHeader("location", "/http-demo/resourceB2");
        // 方法2：
        response.sendRedirect("/http-demo/resourceB2");
    }
}
