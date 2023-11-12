package com.omega.demo03.mapper;

import com.omega.demo03.pojo.Brand;

import java.util.List;

/**
 * Class BrandMapper
 *
 * @author KennySu
 * @date 2023/11/7
 */
public interface BrandMapper {

    /**
     * 查询所有
     */
    List<Brand> selectAll();

    /**
     * 查询一条brand
     */
    Brand selectOneById(Integer id);

    /**
     * 插入数据
     */
    Integer insertOne(Brand brand);

    /**
     * 修改数据by id
     */
    Integer updateById(Brand brand);

    /**
     * 删除数据by id
     */
    Integer deleteById(Integer id);
}
