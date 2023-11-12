package com.omega.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Class SessionServletA
 *
 * @author KennySo
 * @date 2023/11/12
 */
@WebServlet("/sessionServletA")
public class SessionServletA extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取session对象
        HttpSession session = request.getSession();
        System.out.println(session);

        // 2.session储存数据
        session.setAttribute("username", "Kenny");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}