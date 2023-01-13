package com.chenghao.work.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenghao.work.mall.goods.mapper.BrandMapper;
import com.chenghao.work.mall.goods.model.BrandEntity;
import com.chenghao.work.mall.goods.service.IBrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @name: BrandServiceImpl
 * @author: chenghao
 * @date: 2023/1/12
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, BrandEntity> implements IBrandService {

    @Resource
    private BrandMapper brandMapper;

    @Override
    public Page<BrandEntity> queryPageList(Long currentPage, Long size, BrandEntity brand) {
        QueryWrapper<BrandEntity> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(brand.getName())) {
            queryWrapper.like("name", brand.getName());
        }

        return brandMapper.selectPage(new Page<>(currentPage, size), queryWrapper);
    }
}
