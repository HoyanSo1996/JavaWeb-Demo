package com.omega.demo04;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import java.time.LocalDateTime;

/**
 * Class CustomListener
 *
 * @author KennySo
 * @date 2023/11/17
 */
@WebListener
public class CustomListener implements ServletContextListener, ServletContextAttributeListener {

    /**
     * 监听上下文域的创建
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(LocalDateTime.now() + "上下文域被创建");
    }

    /**
     * 监听上下文域的销毁
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println(LocalDateTime.now() + "上下文域被销毁");
    }

    /*
    监听向上下文域中添加键和值
     */
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("向上下文域中添加了键：" + event.getName() + ", 值：" + event.getValue());
    }

    /**
     * 监听上下文域中属性删除
     * @param event
     */
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("上下文域中删除了键：" + event.getName() + ", 值：" + event.getValue());
    }

    /**
     * 监听上下文域中属性修改
     * @param event
     */
    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        //获取当前上下文对象
        ServletContext application = event.getServletContext();
        System.out.println("上下文域中修改了键：" + event.getName() + ", 修改前值：" + event.getValue() + "，修改后的值：" + application.getAttribute(event.getName()));
    }
}
