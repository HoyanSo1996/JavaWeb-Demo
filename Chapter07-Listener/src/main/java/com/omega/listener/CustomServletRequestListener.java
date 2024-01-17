package com.omega.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Class CustomRequestListener
 *
 * @author KennySo
 * @date 2024/1/15
 */
@WebListener
public class CustomServletRequestListener implements ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("CustomServletRequestListener 监听到 request 对象创建.");
        ServletRequest request = sre.getServletRequest();
        System.out.println("访问IP = " + request.getRemoteAddr());
        System.out.println("访问的资源 = " + ((HttpServletRequest) request).getRequestURL());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("CustomServletRequestListener 监听到 request 对象销毁.");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        ServletRequestAttributeListener.super.attributeAdded(srae);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        ServletRequestAttributeListener.super.attributeReplaced(srae);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        ServletRequestAttributeListener.super.attributeRemoved(srae);
    }
}
