package com.omega.demo04;

import javax.servlet.annotation.WebServlet;
import java.util.HashMap;

/**
 * Class ScanServlet
 *
 * @author KennySo
 * @date 2023/12/1
 */
public class ScanServlet {

    private static final HashMap<String, Object> hm = new HashMap<>();

    public static void main(String[] args) throws Exception {
        // 1.首先扫描所有包下的类, 得到所有类的全路径
        String classAllPath = "com.omega.demo04.AnnotationServlet";
        // 2.获取所有类的class对象
        Class<?> aClass = Class.forName(classAllPath);
        // 3.查看class对象上有没有@WebServlet注解
        WebServlet annotation = aClass.getAnnotation(WebServlet.class);
        System.out.println(annotation);
        // 4.获取注解上的urlPattern
        String[] paths = annotation.urlPatterns();
        for (String path : paths) {
            System.out.println("path = " + path);
        }
        // 5.如果匹配了浏览器发过来的url, 且是第一次匹配
        Object instance = aClass.newInstance();
        // 6.将servlet实例放入hashMap中
        hm.put(annotation.name(), instance);
        System.out.println(hm);
    }
}
