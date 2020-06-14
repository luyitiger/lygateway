package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsSeckillSkuNotice;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀商品通知订阅
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsSeckillSkuNoticeService extends IService<SmsSeckillSkuNotice> {

    PageVo queryPage(QueryCondition params);
}

