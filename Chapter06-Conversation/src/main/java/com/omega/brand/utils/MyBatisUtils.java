package com.omega.brand.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Class MyBatisUtils
 *
 * @author KennySu
 * @date 2023/11/7
 */
public class MyBatisUtils {

    /**
     * 会话工厂的创建类->会话工厂->会话
     */
    private static SqlSessionFactory sqlSessionFactory;

    static {
        // 1.会话工厂的创建类
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 2.得到配置文件的输入流
        try (InputStream inputStream = Resources.getResourceAsStream("Mybatis-config.xml")) {
            // 3.创建会话工厂
            sqlSessionFactory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 得到会话对象，默认开启事务，需要手动提交
     */
    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }

    /**
     * 得到会话对象
     * @param autocommit true, 设置自动提交(不需手动提交)
     *                   false, 需要手动提交
     */
    public static SqlSession getSession(boolean autocommit) {
        return sqlSessionFactory.openSession(autocommit);
    }
}
