package com.omega.demo02;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Class BFilterDemo
 *
 * @author KennySo
 * @date 2023/11/16
 */
@WebFilter("/*")
public class BFilterDemo implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("B filter execute...");
        filterChain.doFilter(request, response);
        System.out.println("B filter execute...");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
