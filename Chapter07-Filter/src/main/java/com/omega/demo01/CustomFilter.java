package com.omega.demo01;

import javax.servlet.*;
import java.io.IOException;

/**
 * Class CustomFilter
 *
 * @author KennySo
 * @date 2024/1/18
 */
// @WebFilter("/*")
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CustomFilter 被创建...");;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 放行前, 对request进行处理
        System.out.println("CustomFilter 处理 request...");
        // 放行代码. 只有写了放行代码才能访问servlet资源
        chain.doFilter(request, response);
        // 放行后, 对response进行处理
        System.out.println("CustomFilter 处理 response...");
    }

    @Override
    public void destroy() {
        System.out.println("CustomFilter 被销毁...");;
    }
}
