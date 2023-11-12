package com.omega.demo03.service.impl;

import com.omega.demo03.mapper.BrandMapper;
import com.omega.demo03.mapper.impl.BrandMapperImpl;
import com.omega.demo03.pojo.Brand;
import com.omega.demo03.service.BrandService;

import java.util.List;

/**
 * Class BrandServiceImpl
 *
 * @author KennySu
 * @date 2023/11/7
 */
public class BrandServiceImpl implements BrandService {

    private BrandMapper brandMapper = new BrandMapperImpl();

    @Override
    public List<Brand> selectAll() {
        return brandMapper.selectAll();
    }

    @Override
    public Boolean addBrand(Brand brand) {
        return brandMapper.insertOne(brand) > 0;
    }

    @Override
    public Brand selectOneById(Integer id) {
        return brandMapper.selectOneById(id);
    }

    @Override
    public Boolean updateBrandById(Brand brand) {
        return brandMapper.updateById(brand) > 0;
    }

    @Override
    public Boolean deleteBrandById(Integer id) {
        return brandMapper.deleteById(id) > 0;
    }
}
