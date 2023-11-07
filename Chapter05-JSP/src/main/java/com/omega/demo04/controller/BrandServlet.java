package com.omega.demo04.controller;

import com.omega.demo04.pojo.Brand;
import com.omega.demo04.service.BrandService;
import com.omega.demo04.service.impl.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Class BrandServlet
 *
 * @author KennySu
 * @date 2023/11/7
 */
@WebServlet("/brand/*")
public class BrandServlet extends HttpServlet {

    private BrandService brandService = new BrandServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] url = request.getRequestURI().split("/");
        String path = url[3];

        if ("selectAll".equals(path)) {
            List<Brand> brands = brandService.selectAll();
            request.setAttribute("brands", brands);
            request.getRequestDispatcher("/demo04/brandList.jsp").forward(request, response);

        } else if ("add".equals(path)) {
            // 处理POST请求的乱码问题
            request.setCharacterEncoding("utf-8");

            // 封装为一个Brand对象
            Brand brand = new Brand();
            brand.setBrandName(request.getParameter("brandName"));
            brand.setCompanyName(request.getParameter("companyName"));
            brand.setOrdered(Integer.parseInt(request.getParameter("ordered")));
            brand.setDescription(request.getParameter("description"));
            brand.setStatus(Integer.parseInt(request.getParameter("status")));

            // 添加brand
            brandService.addBrand(brand);
            // 回到查询页面
            request.getRequestDispatcher("/brand/selectAll").forward(request, response);

        } else if ("selectById".equals(path)) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            Brand brand = brandService.selectOneById(id);
            request.setAttribute("brand", brand);
            request.getRequestDispatcher("/demo04/updateBrand.jsp").forward(request, response);

        } else if ("update".equals(path)) {
            // 处理POST请求的乱码问题
            request.setCharacterEncoding("utf-8");

            // 封装为一个Brand对象
            Brand brand = new Brand();
            brand.setId(Integer.parseInt(request.getParameter("id")));
            brand.setBrandName(request.getParameter("brandName"));
            brand.setCompanyName(request.getParameter("companyName"));
            brand.setOrdered(Integer.parseInt(request.getParameter("ordered")));
            brand.setDescription(request.getParameter("description"));
            brand.setStatus(Integer.parseInt(request.getParameter("status")));

            // 修改brand
            brandService.updateBrandById(brand);
            // 转发到查询所有Servlet
            request.getRequestDispatcher("/brand/selectAll").forward(request,response);

        } else if ("deleteById".equals(path)) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            // 删除brand
            brandService.deleteBrandById(id);
            // 转发到查询所有Servlet
            request.getRequestDispatcher("/brand/selectAll").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
