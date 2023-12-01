package com.omega.demo04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class AnnotationServlet
 *
 * @author KennySo
 * @date 2023/12/1
 */
@WebServlet(urlPatterns = {"/demo4", "/demo04"}, loadOnStartup = 2)
public class AnnotationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AnnotationServlet doGet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AnnotationServlet doPost...");
    }
}
