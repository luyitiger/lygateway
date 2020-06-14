package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsSkuFullReduction;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品满减信息
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsSkuFullReductionService extends IService<SmsSkuFullReduction> {

    PageVo queryPage(QueryCondition params);
}

