package com.omega.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

/**
 * Class CustomHttpSessionListener
 *
 * @author KennySo
 * @date 2024/1/15
 */
@WebListener
public class CustomHttpSessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        session.setMaxInactiveInterval(10);
        System.out.println("CustomHttpSessionListener 监听到 session=" + session.getId() + " 创建成功.");
        System.out.println("用户id=" + session.getId() + " 上线!");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println("CustomHttpSessionListener 监听到 session=" + session.getId() + " 销毁成功.");
        System.out.println("用户id=" + session.getId() + " 离线!");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("CustomHttpSessionListener 监听到 session 添加属性: " + event.getName() + "=" + event.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("CustomHttpSessionListener 监听到 session 修改属性:" + event.getName() + ". " +
                "修改前值: " + event.getValue() + ", " +
                "修改后的值: " + event.getSession().getAttribute(event.getName()));
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("CustomHttpSessionListener 监听到 session 删除属性: " + event.getName() + "=" + event.getValue());
    }
}
