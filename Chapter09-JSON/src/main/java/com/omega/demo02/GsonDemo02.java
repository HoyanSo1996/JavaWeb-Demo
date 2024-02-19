package com.omega.demo02;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.omega.demo02.pojo.Book;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Class GsonDemo02
 * List 集合和 json 字符串转换
 *
 * @author KennySo
 * @date 2024/2/19
 */
public class GsonDemo02 {
    public static void main(String[] arg) {
        Gson gson = new Gson();
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(200, "天龙八部"));
        bookList.add(new Book(300, "神雕侠侣"));

        // (1) 将list转成json字符串
        String bookListStr = gson.toJson(bookList);
        System.out.println(bookListStr);

        /*
           (2) 将json字符串转成list
               在将json字符串转换为list集合时, 需要知道映射对象的类型来进行反射
               (即完整路径 java.util.List<com.omega.demo02.pojo.Book>)
               gson就提供了 TypeToken 类来获知需要返回的对象类型, 下面的type打印出来就是类的完整路径
         */
        /*
            方式1: 使用匿名内部类
            使用原因: 因为 TypeToken 类的无参构造器是protect修饰的, 即不同包不能访问, 否则会报
            'TypeToken()' has protected access in 'com.google.gson.reflect.TypeToken' 异常.
            当使用后 new TypeToken<List<Book>>() {} 后, 得到的是一个匿名内部类, 它的的运行类型为
            class com.omega.demo02.GsonDemo02$2, 相当于 TypeToken 的子类, 这个匿名内部类有一个无参构造器(隐式),
            这个隐式的无参构造器里面有个 super(), 会调用父类的无参构造器, 从而可以继承父类的所有功能.
            总结: 使用匿名内部类可以破解protect关键词修饰的构造器在不同包内不能创建的问题.
         */
        Type type = new TypeToken<List<Book>>() {}.getType();
        // System.out.println(type);
        // System.out.println(new TypeToken<List<Book>>() {}.getClass());
        List<Book> bookList2 = gson.fromJson(bookListStr, type);
        System.out.println(bookList2);

        // 方式2: 直接使用子类
        List<Book> bookList3 = gson.fromJson(bookListStr, new BookType().getType());
        System.out.println(bookList3);
    }

    /**
     * 要把复杂的 json 字符串转换成为 java 对象。需要继承 TypeToken 类.
     * TypeToken 是一个自定义泛型类，在创建时，需要指定具体类型，这里我们指定为 List<Book>.
     */
    static class BookType extends TypeToken<List<Book>> {
    }
}
