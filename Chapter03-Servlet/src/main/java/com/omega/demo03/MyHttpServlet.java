package com.omega.demo03;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Class MyHttpServlet
 *
 * @author KennySo
 * @date 2023/12/1
 */
public class MyHttpServlet implements Servlet {

    public void init(ServletConfig config) throws ServletException {}

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        // 1.获取请求方式
        String method = request.getMethod();
        // 2.判断
        if("GET".equals(method)){
            // get方式的处理逻辑
            doGet(req, res);
        }else if("POST".equals(method)){
            // post方式的处理逻辑
            doPost(req, res);
        }
    }

    protected void doPost(ServletRequest req, ServletResponse res) {
        System.out.println("MyHttpServlet doPost...");
    }

    protected void doGet(ServletRequest req, ServletResponse res) {
        System.out.println("MyHttpServlet doGet...");
    }

    public void destroy() {}

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }
}
