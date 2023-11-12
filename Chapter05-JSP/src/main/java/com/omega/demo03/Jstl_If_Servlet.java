package com.omega.demo03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class JstlServlet
 *
 * @author KennySu
 * @date 2023/11/7
 */
@WebServlet("/jstl/if")
public class Jstl_If_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.存储数据到request域中
        request.setAttribute("status", 1);
        // 2.转发到 jstl-if.jsp
        request.getRequestDispatcher("/demo03/jstl-if.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}