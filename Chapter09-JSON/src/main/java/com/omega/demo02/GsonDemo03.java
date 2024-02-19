package com.omega.demo02;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.omega.demo02.pojo.Book;

import java.util.HashMap;
import java.util.Map;

/**
 * Class GsonDemo
 * map 集合和 json 的转换
 *
 * @author KennySo
 * @date 2024/2/19
 */
public class GsonDemo03 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("sn1", new Book(10, "射雕英雄传"));
        bookMap.put("sn2", new Book(20, "碧血剑"));

        // (1) 将 map 转换成 json
        String bookMapStr = gson.toJson(bookMap);
        System.out.println(bookMapStr);

        // (2) 将 json 转成 map
        Map<String, Book> bookMap2 = gson.fromJson(bookMapStr, new TypeToken<HashMap<String, Book>>() {}.getType());
        System.out.println(bookMap2);
    }
}
