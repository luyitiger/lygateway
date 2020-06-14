package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsSeckillSkuRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀活动商品关联
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsSeckillSkuRelationService extends IService<SmsSeckillSkuRelation> {

    PageVo queryPage(QueryCondition params);
}

