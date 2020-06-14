package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsSkuBoundsDao;
import com.luyigu.gmall.sms.entity.SmsSkuBounds;
import com.luyigu.gmall.sms.service.SmsSkuBoundsService;

@Service("smsSkuBoundsService")
public class SmsSkuBoundsServiceImpl extends ServiceImpl<SmsSkuBoundsDao, SmsSkuBounds> implements SmsSkuBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsSkuBounds> page = this.page(
                new Query<SmsSkuBounds>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}