package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsSkuBounds;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品sku积分设置
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsSkuBoundsService extends IService<SmsSkuBounds> {

    PageVo queryPage(QueryCondition params);
}

