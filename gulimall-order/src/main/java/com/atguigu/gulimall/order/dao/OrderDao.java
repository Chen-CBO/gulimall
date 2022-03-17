package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author py
 * @email 20844@qq.com
 * @date 2022-02-19 09:56:55
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
