package com.luyigu.gmall.oms.dao;

import com.luyigu.gmall.oms.entity.OmsOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrder> {
	
}
