package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsSeckillPromotionDao;
import com.luyigu.gmall.sms.entity.SmsSeckillPromotion;
import com.luyigu.gmall.sms.service.SmsSeckillPromotionService;

@Service("smsSeckillPromotionService")
public class SmsSeckillPromotionServiceImpl extends ServiceImpl<SmsSeckillPromotionDao, SmsSeckillPromotion> implements SmsSeckillPromotionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsSeckillPromotion> page = this.page(
                new Query<SmsSeckillPromotion>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}