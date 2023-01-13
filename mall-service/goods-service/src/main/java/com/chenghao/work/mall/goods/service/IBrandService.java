package com.chenghao.work.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chenghao.work.mall.goods.model.BrandEntity;

/**
 * @name: BrandService
 * @author: chenghao
 * @date: 2023/1/12
 */
public interface IBrandService extends IService<BrandEntity> {
    /**
     * @param currentPage 当前页面
     * @param size        页面大小
     * @param brand       品牌实体
     * @return 品牌分页对象
     */
    Page<BrandEntity> queryPageList(Long currentPage, Long size, BrandEntity brand);
}
