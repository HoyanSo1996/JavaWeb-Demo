package com.omega.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Class RequestAPI
 *
 * @author KennySo
 * @date 2023/10/22
 */
@WebServlet("/request/body")
public class RequestBodyAPIs extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 读取的是一行数据
        BufferedReader reader = request.getReader();
        String line = reader.readLine();
        System.out.println("请求体数据：" + line);
    }
}
