package com.omega.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Class CustomServletContextListener
 *
 * @author KennySo
 * @date 2024/1/15
 */
public class CustomServletContextListener implements ServletContextListener, ServletContextAttributeListener {

    /**
     * 监听上下文域的创建
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象" + sce.getServletContext() + " 创建成功, 进行初始化工作...");
    }

    /**
     * 监听上下文域的销毁
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象" + sce.getServletContext() + " 销毁成功, 进行资源回收工作...");
    }


    /**
     * 监听向上下文域中添加键和值
     */
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("ServletContext 添加了属性: " + event.getName() + "=" + event.getValue());
    }


    /**
     * 监听上下文域中属性修改
     *    修改完上下文域中的属性后, 直接使用 even.getValue() 得到的还是修改前的值,
     *    需要使用 event.getServletContext().getAttribute(event.getName()) 才能获取修改后的值(当前的值).
     *   （此处 getAttribute("xxx") 中的值不能写成一开始设置的上下文域的键，因为不知道键有没改过）
     */
    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("ServletContext 修改了属性: " + event.getName() + ". " +
                "修改前值: " + event.getValue() + ", " +
                "修改后的值: " + event.getServletContext().getAttribute(event.getName()));
    }

    /**
     * 监听上下文域中属性删除
     */
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("ServletContext 删除了属性: " + event.getName() + "=" + event.getValue());
    }
}
