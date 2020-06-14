package com.luyigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.oms.entity.OmsOrder;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单
 *
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
public interface OmsOrderService extends IService<OmsOrder> {

    PageVo queryPage(QueryCondition params);
}

