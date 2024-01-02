package com.omega.homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class Calculator
 *
 * @author KennySo
 * @date 2024/1/2
 */
@WebServlet("/calServlet")
public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operator = request.getParameter("operator");
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                break;
        }

        // 使用格式化
        String resultInfo = String.format("%s %s %s = %s", num1, operator, num2, result);
        // 因为一次请求对应一次计算, 所以放在request中比较好
        request.setAttribute("resultInfo", resultInfo);
        request.getRequestDispatcher("/homework/calculatorRes.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
