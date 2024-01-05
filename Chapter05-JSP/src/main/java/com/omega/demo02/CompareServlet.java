package com.omega.demo02;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Class CompareServlet
 *
 * @author KennySo
 * @date 2024/1/2
 */
@WebServlet("/compare")
public class CompareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 对应out
        PrintWriter writer = response.getWriter();
        // 对应request
        String username = request.getParameter("username");
        // 对应response
        response.sendRedirect("https://www.baidu.com");
        // 对应Session
        HttpSession session = request.getSession();
        session.setAttribute("password", "123456");
        // 对应application
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("age", "28");
        // 对应ServletConfig
        ServletConfig servletConfig = getServletConfig();
        String email = servletConfig.getInitParameter("email");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
