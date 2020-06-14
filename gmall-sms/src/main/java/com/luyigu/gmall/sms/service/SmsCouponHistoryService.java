package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsCouponHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券领取历史记录
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsCouponHistoryService extends IService<SmsCouponHistory> {

    PageVo queryPage(QueryCondition params);
}

