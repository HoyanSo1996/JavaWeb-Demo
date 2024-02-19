package com.omega.demo02;

import com.google.gson.Gson;
import com.omega.demo02.pojo.Book;

/**
 * Class GsonDemo01
 * @apiNote java 对象和 json 字符串转换
 *
 * @author KennySo
 * @date 2024/2/19
 */
public class GsonDemo01 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Book book1 = new Book(100, "三国演义");
        // (1) 将java对象转换成json字符串
        String jsonStr = gson.toJson(book1);
        System.out.println(jsonStr);

        // (2) 将json字符串转换成java对象
        Book book2 = gson.fromJson(jsonStr, Book.class);
        System.out.println(book2);
    }
}
