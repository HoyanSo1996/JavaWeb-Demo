package com.omega.demo03.mapper.impl;

import com.omega.demo03.mapper.UserMapper;
import com.omega.demo03.pojo.User;
import com.omega.demo03.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * Class UserMapperImpl
 *
 * @author KennySo
 * @date 2023/11/12
 */
public class UserMapperImpl implements UserMapper {

    @Override
    public User selectOne(String username, String password) {
        SqlSession sqlSession = MyBatisUtils.getSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectOne(username, password);
        sqlSession.close();
        return user;
    }

    @Override
    public User selectByUsername(String username) {
        SqlSession sqlSession = MyBatisUtils.getSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByUsername(username);
        sqlSession.close();
        return user;
    }

    @Override
    public Integer insertOne(User user) {
        SqlSession sqlSession = MyBatisUtils.getSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Integer count = userMapper.insertOne(user);
        sqlSession.close();
        return count;
    }

}
