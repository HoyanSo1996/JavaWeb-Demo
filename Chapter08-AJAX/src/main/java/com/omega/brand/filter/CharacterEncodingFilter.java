package com.omega.brand.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Class CharacterEncodingFilter
 *
 * @author KennySo
 * @date 2023/11/27
 */
@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        if ("POST".equals(httpServletRequest.getMethod())) {
            request.setCharacterEncoding("UTF-8");
        }
        // 无论GET或者POST都要设置
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }
}
