package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author py
 * @email 20844@qq.com
 * @date 2022-02-19 09:56:55
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
