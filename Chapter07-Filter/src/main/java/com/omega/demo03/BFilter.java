package com.omega.demo03;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Class BFilter
 *
 * @author KennySo
 * @date 2024/1/23
 */
@WebFilter("/*")
public class BFilter implements Filter {

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
