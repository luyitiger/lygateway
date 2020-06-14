package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsSeckillSession;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀活动场次
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsSeckillSessionService extends IService<SmsSeckillSession> {

    PageVo queryPage(QueryCondition params);
}

