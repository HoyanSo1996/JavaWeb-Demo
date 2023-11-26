package com.omega.demo02;

import javax.servlet.*;
import java.io.IOException;

/**
 * Class FilterDemo2
 *
 * @author KennySo
 * @date 2023/11/16
 */
//@WebFilter("/*")
public class AFilterDemo implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("A filter execute...");
        filterChain.doFilter(request, response);
        System.out.println("A filter execute...");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
