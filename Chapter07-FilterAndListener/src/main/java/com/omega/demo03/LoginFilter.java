package com.omega.demo03;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Class LoginFilter
 *
 * @author KennySo
 * @date 2023/11/16
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 1.在数组中存储登陆和注册相关的资源路径
        String[] urls = {"/imgs/", "/css/", "/login.jsp", "/loginServlet", "/register.jsp", "/registerServlet", "/checkCodeServlet"};
        // 2.获取当前访问的资源路径
        HttpServletRequest req = (HttpServletRequest) request;
        String url = req.getRequestURL().toString();

        // 3.遍历数组，获取到每一个需要放行的资源路径
        for (String u : urls) {
            /*
                4.判断当前访问的资源路径字符串是否包含要放行的的资源路径字符串
    	         比如当前访问的资源路径是 /brand-demo/login.jsp
    	         而字符串 /brand-demo/login.jsp 包含了字符串 /login.jsp, 所以这个字符串就需要放行
            */
            if (url.contains(u)) {
                // 找到了, 放行
                chain.doFilter(request, response);
                return;
            }
        }

        // 5.判断session中是否有user
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");

        // 6.判断user是否为null
        if (user != null) {
            // 登录过了, 放行
            chain.doFilter(request, response);
        } else {
            // 没有登陆，存储提示信息，跳转到登录页面
            req.setAttribute("login_msg", "您尚未登陆！");
            req.getRequestDispatcher("/login.jsp").forward(req, response);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
