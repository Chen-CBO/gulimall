package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author py
 * @email 20844@qq.com
 * @date 2022-02-19 09:07:02
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
