package com.omega.demo07;

import javax.servlet.ServletContext;

/**
 * Class Counter
 *
 * @author KennySo
 * @date 2023/12/5
 */
public class WebUtils {

    public static Integer countWebsiteVisit(ServletContext servletContext) {
        //从 servletContext 获取 visit_count 属性 k-v
        Object visitCount = servletContext.getAttribute("visit_count");
        if (visitCount == null) {   // 第一次访问网站
            visitCount = 1;
            servletContext.setAttribute("visit_count", visitCount);
        } else {   // 第二次以后访问网站
            visitCount = Integer.parseInt(visitCount + "") + 1;
            servletContext.setAttribute("visit_count", visitCount);
        }

        return (Integer) visitCount;
    }
}
