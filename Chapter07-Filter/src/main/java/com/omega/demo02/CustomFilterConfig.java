package com.omega.demo02;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Class CustomFilterConfig
 *
 * @author KennySo
 * @date 2024/1/23
 */
public class CustomFilterConfig implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("获取 过滤器名= " + filterConfig.getFilterName());
        System.out.println("获取 servletContext= " + filterConfig.getServletContext());
        System.out.println("获取 配置信息ip= " + filterConfig.getInitParameter("ip"));

        System.out.println("获取所有配置信息");
        Enumeration<String> initParameterNames = filterConfig.getInitParameterNames();
        // 枚举的遍历(不能for循环)
        while (initParameterNames.hasMoreElements()) {
            String initParameterName = initParameterNames.nextElement();
            System.out.println(initParameterName + " = " + filterConfig.getInitParameter(initParameterName));
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
