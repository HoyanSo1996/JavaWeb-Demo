package com.omega.demo03;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class ResourceA
 *
 * @author KennySu
 * @date 2023/11/2
 */
@WebServlet("/resourceA")
public class ResourceA extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("resourceA...");
        // 请求转发
        request.getRequestDispatcher("/resourceB").forward(request, response);
    }
}
