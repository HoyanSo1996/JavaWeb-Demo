package com.omega.demo01;

import javax.servlet.*;
import java.io.IOException;

/**
 * Class CustomServlet
 * servlet 的基本操作
 *
 * @author KennySo
 * @date 2023/10/15
 */
public class CustomServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {}

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello, custom servlet!");
    }

    @Override
    public void destroy() {}

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
}
