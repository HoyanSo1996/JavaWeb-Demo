package com.omega.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Class CustomServlet
 *
 * @author KennySo
 * @date 2024/1/15
 */
@WebServlet("/listener")
public class CustomServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        // 操作 ServletContext 对象
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("username", "Kenny");
        servletContext.setAttribute("username", "Cody");
        servletContext.removeAttribute("username");

        // 操作 Session 对象
        HttpSession session = req.getSession();
        session.setAttribute("password", "123");
        session.setAttribute("password", "456");
        session.removeAttribute("password");

        // 操作 Request 对象

        System.out.println("CustomServlet 执行完毕~");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        this.doGet(req, resp);
    }
}
