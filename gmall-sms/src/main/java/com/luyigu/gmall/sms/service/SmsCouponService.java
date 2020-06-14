package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsCoupon;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券信息
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsCouponService extends IService<SmsCoupon> {

    PageVo queryPage(QueryCondition params);
}

