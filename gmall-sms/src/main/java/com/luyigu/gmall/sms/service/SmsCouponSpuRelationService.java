package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsCouponSpuRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券与产品关联
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsCouponSpuRelationService extends IService<SmsCouponSpuRelation> {

    PageVo queryPage(QueryCondition params);
}

