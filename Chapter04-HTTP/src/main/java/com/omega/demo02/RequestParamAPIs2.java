package com.omega.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Class RequestParamAPIs2
 * 中文乱码问题解决方案
 *
 * @author KennySu
 * @date 2023/11/2
 */
@WebServlet("/request/param2")
public class RequestParamAPIs2 extends HttpServlet {

    /**
     * 要使用tomcat7的插件测试
     * 也可以再插件里设置 <uriEncoding>UTF-8</uriEncoding>
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取username
        String username = request.getParameter("username");
        System.out.println("解决乱码前：" + username);

        // 2.按照ISO-8859-1编码获取乱码对应的字节数组
        byte[] bytes = username.getBytes(StandardCharsets.ISO_8859_1);

        // 3.照UTF-8编码获取字节数组对应的字符串
        username = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("解决乱码后：" + username);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.解决乱码: 设置字符输入流的编码，设置的字符集要和页面保持一致
        request.setCharacterEncoding("UTF-8");

        // 2.获取username
        String username = request.getParameter("username");
        System.out.println(username);
    }
}
