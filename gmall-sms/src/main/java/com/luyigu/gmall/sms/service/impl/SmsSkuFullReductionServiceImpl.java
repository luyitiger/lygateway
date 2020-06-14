package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsSkuFullReductionDao;
import com.luyigu.gmall.sms.entity.SmsSkuFullReduction;
import com.luyigu.gmall.sms.service.SmsSkuFullReductionService;

@Service("smsSkuFullReductionService")
public class SmsSkuFullReductionServiceImpl extends ServiceImpl<SmsSkuFullReductionDao, SmsSkuFullReduction> implements SmsSkuFullReductionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsSkuFullReduction> page = this.page(
                new Query<SmsSkuFullReduction>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}