package com.omega.homework;

import com.omega.demo01.pojo.Monster;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class SearchServlet
 *
 * @author KennySo
 * @date 2024/1/5
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Monster> monsterList = new ArrayList<>();
        monsterList.add(new Monster(100, "小妖怪", "巡山的"));
        monsterList.add(new Monster(200, "大妖怪", "做饭的"));
        monsterList.add(new Monster(300, "老妖怪", "扫地的"));

        req.setAttribute("monsterList", monsterList);
        // 请求转发
        req.getRequestDispatcher("/homework/searchRes.jsp").forward(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
