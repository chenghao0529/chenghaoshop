package com.chenghao.work.mall.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenghao.work.mall.goods.mapper.BrandMapper;
import com.chenghao.work.mall.goods.model.BrandEntity;
import com.chenghao.work.mall.goods.service.IBrandService;
import org.springframework.stereotype.Service;

/**
 * @name: BrandServiceImpl
 * @author: chenghao
 * @date: 2023/1/12
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, BrandEntity> implements IBrandService {
}
