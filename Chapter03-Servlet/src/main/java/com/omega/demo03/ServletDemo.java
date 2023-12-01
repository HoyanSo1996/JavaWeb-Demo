package com.omega.demo03;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Class ServletDemo
 *
 * @author KennySo
 * @date 2023/12/1
 */
public class ServletDemo implements Servlet {

    public void init(ServletConfig config) throws ServletException {}

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 获取请求方式，根据不同的请求方式进行不同的业务处理
        HttpServletRequest request = (HttpServletRequest)req;
        // 1.获取请求方式
        String method = request.getMethod();
        // 2.判断
        if ("GET".equals(method)) {
            // get方式的处理逻辑
            System.out.println("ServletDemo doGet...");
        } else if ("POST".equals(method)){
            // post方式的处理逻辑
            System.out.println("ServletDemo doPost...");
        }
    }

    public void destroy() {}

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return null;
    }
}
