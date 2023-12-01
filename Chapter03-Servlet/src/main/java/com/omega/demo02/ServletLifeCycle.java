package com.omega.demo02;

import javax.servlet.*;
import java.io.IOException;

/**
 * Class ServletLifeCycle
 *
 * @author KennySo
 * @date 2023/10/21
 */
public class ServletLifeCycle implements Servlet {

    private ServletConfig servletConfig;

    /**
     * 初始化方法
     * 1.调用时机：servlet在实例化时调用
     * 2.调用次数: 1次
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }

    /**
     * 提供服务方法
     * 1.调用时机：每次servlet被访问, 都会调用该方法。
     * 2.调用次数：多次
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet is invoked...");
        System.out.println("Servlet实例: " + this);  // 同一个对象
        System.out.println("线程: " + Thread.currentThread().getId());  // 不同线程
    }

    /**
     * 销毁方法
     * 1.调用时机：当Servlet被销毁时, 调用该方法。(在内存释放或服务器关闭时会自动销毁 Servlet）
     * 2.调用次数: 1次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
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
