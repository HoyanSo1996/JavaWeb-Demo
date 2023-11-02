package com.omega.demo02;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Class ServletLifeCycle
 *
 * @author KennySo
 * @date 2023/10/21
 */
// loadOnStartup (默认为-1)的取值有两类情况:
// (1) 0或正整数: 服务器启动时实例化Servlet对象, 数字越小优先级越高.
// (2) 负整数: 第一次访问时实例化Servlet对象.
@WebServlet(urlPatterns = "/demo2", loadOnStartup = 1)
public class ServletLifeCycle implements Servlet {

    private ServletConfig servletConfig;

    /**
     * 初始化方法
     * 1.调用时机：servlet在实例化时调用
     * 2.调用次数: 1次
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println(LocalDateTime.now() + " init...");
    }

    /**
     * 提供服务方法
     * 1.调用时机：每次servlet被访问, 都会调用该方法。
     * 2.调用次数：多次
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(LocalDateTime.now() + " servlet is invoked...");
    }

    /**
     * 销毁方法
     * 1.调用时机：当Servlet被销毁时, 调用该方法。(在内存释放或服务器关闭时会自动销毁 Servlet）
     * 2.调用次数: 1次
     */
    @Override
    public void destroy() {
        System.out.println(LocalDateTime.now() + " destroy...");
    }

    /**
     * 获取servlet配置信息
     * ServletConfig对象，在init方法的参数中有，而Tomcat Web服务器在创建Servlet对象的时候
     * 会调用init方法，必定会传入一个ServletConfig对象，我们只需要将服务器传过来的ServletConfig进行返回即可。
     */
    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    /**
     * 获取servlet信息
     */
    @Override
    public String getServletInfo() {
        return null;
    }
}
