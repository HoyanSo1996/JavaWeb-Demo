package com.omega.demo02;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.omega.demo02.pojo.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class GsonDemo
 *
 * @author KennySo
 * @date 2024/2/18
 */
public class GsonDemo {

    private static final Gson gson = new Gson();

    /**
     * 1. java 对象和 json 字符串转换
     */
    public static void transferObject() {
        System.out.println("====== 1. java 对象和 json 的转换 ======");
        Book book1 = new Book(100, "三国演义");
        // (1) 将对象转换成json字符串
        String jsonStr = gson.toJson(book1);
        System.out.println(jsonStr);
        // (2) 将json字符串转换成对象
        Book book2 = gson.fromJson(jsonStr, Book.class);
        System.out.println(book2);
    }

    /**
     * 要把复杂的 json 字符串转换成为 java 对象。需要继承 TypeToken 类.
     * TypeToken 是一个自定义泛型类，在创建时，需要指定具体类型，这里我们指定为 List<Book>.
     * TypeToken 是由 gson 包提供.
     */
    static class BookType extends TypeToken<List<Book>> {
    }

    /**
     * 2. List 集合和 json 字符串转换
     */
    public static void transferList() {
        System.out.println("\n====== 2. List 集合和 json 的转换 ======");
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(200, "天龙八部"));
        bookList.add(new Book(300, "神雕侠侣"));
        // (1) 将list转成json字符串
        String bookListStr = gson.toJson(bookList);
        System.out.println(bookListStr);

        // (2) 将json字符串转成list
        // 将 json 字符串转成 List 集合方式1
        List<Book> bookList2 = gson.fromJson(bookListStr, new BookType().getType());
        System.out.println(bookList2);
        // 将 json 字符串转成 List 集合方式2 - 使用匿名内部类
        List<Book> bookList3 = gson.fromJson(bookListStr, new TypeToken<List<Book>>() {
        }.getType());
        System.out.println(bookList3);
    }

    /**
     * 3. map 集合和 json 的转换
     */
    public static void transferMap() {
        System.out.println("\n====== 3. map 集合和 json 的转换 ======");
        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("sn1", new Book(10, "射雕英雄传"));
        bookMap.put("sn2", new Book(20, "碧血剑"));
        // (1) 将 map 转换成 json
        String bookMapStr = gson.toJson(bookMap);
        System.out.println(bookMapStr);
        // (2) 将 json 转成 map
        Map<String, Book> bookMap2 = gson.fromJson(bookMapStr, new TypeToken<HashMap<String, Book>>() {
        }.getType());
        System.out.println(bookMap2);
    }

    public static void main(String[] args) {
        // java对象和json字符串转换
        transferObject();
        // List 集合和 json 的转换
        transferList();
        // map 集合和 json 的转换
        transferMap();
    }
}
