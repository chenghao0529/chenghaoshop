package com.chenghao.work.mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chenghao.work.mall.common.util.RespResult;
import com.chenghao.work.mall.goods.model.BrandEntity;
import com.chenghao.work.mall.goods.service.IBrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @name: BrandController
 * @author: chenghao
 * @date: 2023/1/12
 */
@RestController
@RequestMapping("brand")
public class BrandController {

    @Resource
    private IBrandService brandService;

    /***
     * 增加品牌
     */
    @PostMapping
    public RespResult add(@RequestBody BrandEntity brand){
        // 增加品牌
        brandService.save(brand);
        return RespResult.ok();
    }

    /****
     * 修改
     */
    @PutMapping
    public RespResult update(@RequestBody BrandEntity brand){
        //修改品牌
        brandService.updateById(brand);
        return RespResult.ok();
    }

    /****
     * 删除品牌
     */
    @DeleteMapping("/{id}")
    public RespResult delete(@PathVariable(value = "id") Integer id) {
        //删除品牌
        brandService.removeById(id);
        return RespResult.ok();
    }

    /****
     * 条件分页查询
     */
    @PostMapping(value = "/list/{page}/{size}")
    public RespResult<Page<BrandEntity>> list(
            @PathVariable(value = "page") Long currentPage,
            @PathVariable(value = "size") Long size,
            @RequestBody(required = false) BrandEntity brand) {
        // 分页查询
        Page<BrandEntity> brandPage = brandService.queryPageList(currentPage, size, brand);
        return RespResult.ok(brandPage);
    }
}
