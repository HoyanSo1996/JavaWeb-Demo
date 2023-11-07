package com.omega.demo04.service;

import com.omega.demo04.pojo.Brand;

import java.util.List;

/**
 * Class BrandService
 *
 * @author KennySu
 * @date 2023/11/7
 */
public interface BrandService {

    /**
     * 查询所有的品牌
     */
    List<Brand> selectAll();

    /**
     * 插入一条数据
     */
    Boolean addBrand(Brand brand);

    /**
     * 查询一条数据by id
     */
    Brand selectOneById(Integer id);

    /**
     * 修改一条数据by id
     */
    Boolean updateBrandById(Brand brand);

    /**
     * 删除一条数据by id
     */
    Boolean deleteBrandById(Integer id);
}
