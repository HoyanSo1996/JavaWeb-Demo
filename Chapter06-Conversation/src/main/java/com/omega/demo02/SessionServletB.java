package com.omega.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Class SessionServletB
 *
 * @author KennySo
 * @date 2023/11/12
 */
@WebServlet("/sessionServletB")
public class SessionServletB extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取session对象
        HttpSession session = request.getSession();
        System.out.println(session);

        // 销毁session
        // session.invalidate();

        // 2.获取session中的数据
        String username = (String) session.getAttribute("username");
        System.out.println("username : " + username);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
