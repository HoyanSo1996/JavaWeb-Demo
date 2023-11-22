package com.omega.demo02;

import com.alibaba.fastjson.JSON;

/**
 * Class FastjsonDemo
 *
 * @author KennySu
 * @date 2023/11/20
 */
public class FastjsonDemo {

    public static void main(String[] args) {
        User user = new User(1, "张三", "123456");
        // 1.java对象 转为 json字符串
        String jsonStr = JSON.toJSONString(user);
        System.out.println("jsonStr : " + jsonStr);

        // 2.json字符串转对象
        User user2 = JSON.parseObject(jsonStr, User.class);
        System.out.println("user : " + user);
    }
}
