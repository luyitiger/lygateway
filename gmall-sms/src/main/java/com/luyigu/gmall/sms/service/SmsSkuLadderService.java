package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsSkuLadder;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品阶梯价格
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsSkuLadderService extends IService<SmsSkuLadder> {

    PageVo queryPage(QueryCondition params);
}

