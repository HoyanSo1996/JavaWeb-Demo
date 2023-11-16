package com.omega.demo01;


import javax.servlet.*;
import java.io.IOException;

/**
 * Class FilterDemo
 *
 * @author KennySo
 * @date 2023/11/15
 */
//@WebFilter("/*")
public class FilterDemo implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        // 放行前, 对request进行处理
        System.out.println("filter is invoked when request entered.");
        // 放行代码
        filterChain.doFilter(request, response);
        // 放行后, 对response进行处理
        System.out.println("filter is invoked when response returned.");
    }

    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
