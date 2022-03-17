package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author py
 * @email 20844@qq.com
 * @date 2022-02-18 13:56:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
