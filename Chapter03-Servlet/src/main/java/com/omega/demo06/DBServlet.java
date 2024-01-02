package com.omega.demo06;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class DBServlet
 *
 * @author KennySo
 * @date 2023/12/4
 */
public class DBServlet extends HttpServlet {

    /**
     * ServletConfig对象存放在GenericServlet的成员对象中, 是tomcat创建完后通过
     * init()方法放入的, 如果把该方法的super.init(config)注释掉, 那么GenericServlet中
     * 的servletConfig成员变量为null, 则下方的servletConfig.getXxx()会报空指针异常
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取ServletConfig对象(用的是GenericServlet中的方法,这个对象时transient的,即不可序列化写到文件)
        ServletConfig servletConfig = getServletConfig();
        // 2.获取servlet-name
        String servletName = servletConfig.getServletName();
        System.out.println("servlet-name: " + servletName);
        // 3.获取init-param
        String username = servletConfig.getInitParameter("username");
        String password = servletConfig.getInitParameter("password");
        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doGet(request, response);
    }
}
