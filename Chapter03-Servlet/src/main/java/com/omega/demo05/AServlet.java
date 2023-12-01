package com.omega.demo05;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class AServlet
 * 精确匹配 > 目录匹配 > /* > 扩展名匹配 > / > DefaultServlet
 *
 * @author KennySo
 * @date 2023/12/2
 */
//@WebServlet("/aa/bb.cc")
public class AServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AServlet doGet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AServlet doPost...");
    }
}
