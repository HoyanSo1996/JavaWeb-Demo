package com.omega.scenario;

import javax.servlet.*;
import java.io.IOException;

/**
 * Class TopicFilter
 *
 * @author KennySo
 * @date 2024/1/22
 */
public class TopicFilter implements Filter {

    private static String[] forbiddenWordArr;
    private static final String ERROR_INFO = "有敏感词..";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String forbiddenWords = filterConfig.getInitParameter("forbiddenWords");
        forbiddenWordArr = forbiddenWords.split(",");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 解决中文乱码
        request.setCharacterEncoding("UTF-8");
        request.setAttribute("username", request.getParameter("username"));
        request.setAttribute("comment", request.getParameter("comment"));

        String comment = request.getParameter("comment");
        for (String forbiddenWord : forbiddenWordArr) {
            if (comment == null) {
                request.getRequestDispatcher("/scenario/topic.jsp").forward(request, response);
                return;
            }
            if (comment.contains(forbiddenWord)) {
                request.setAttribute("error_info", ERROR_INFO);
                request.getRequestDispatcher("/scenario/topic.jsp").forward(request, response);
                return;
            }
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
