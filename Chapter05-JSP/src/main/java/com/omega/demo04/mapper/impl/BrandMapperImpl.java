package com.omega.demo04.mapper.impl;

import com.omega.demo04.mapper.BrandMapper;
import com.omega.demo04.pojo.Brand;
import com.omega.demo04.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Class BrandMapperImpl
 *
 * @author KennySu
 * @date 2023/11/7
 */
public class BrandMapperImpl implements BrandMapper {

    @Override
    public List<Brand> selectAll() {
        // 1.创建会话
        SqlSession sqlSession = MyBatisUtils.getSession();
        // 2.创建代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        // 3.调用方法
        List<Brand> brands = brandMapper.selectAll();
        // 4.释放资源
        sqlSession.close();
        return brands;
    }

    @Override
    public Brand selectOneById(Integer id) {
        SqlSession sqlSession = MyBatisUtils.getSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = brandMapper.selectOneById(id);
        sqlSession.close();
        return brand;
    }

    @Override
    public Integer insertOne(Brand brand) {
        SqlSession sqlSession = MyBatisUtils.getSession(true); //设置手动提交事务
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Integer count = brandMapper.insertOne(brand);
        sqlSession.close();
        return count;
    }

    @Override
    public Integer updateById(Brand brand) {
        SqlSession sqlSession = MyBatisUtils.getSession(true); //设置手动提交事务
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Integer count = brandMapper.updateById(brand);
        sqlSession.close();
        return count;
    }

    @Override
    public Integer deleteById(Integer id) {
        SqlSession sqlSession = MyBatisUtils.getSession(true); //设置手动提交事务
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Integer count = brandMapper.deleteById(id);
        sqlSession.close();
        return count;
    }
}
