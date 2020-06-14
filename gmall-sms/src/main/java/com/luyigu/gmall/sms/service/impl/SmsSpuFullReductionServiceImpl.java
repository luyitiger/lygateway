package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsSpuFullReductionDao;
import com.luyigu.gmall.sms.entity.SmsSpuFullReduction;
import com.luyigu.gmall.sms.service.SmsSpuFullReductionService;

@Service("smsSpuFullReductionService")
public class SmsSpuFullReductionServiceImpl extends ServiceImpl<SmsSpuFullReductionDao, SmsSpuFullReduction> implements SmsSpuFullReductionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsSpuFullReduction> page = this.page(
                new Query<SmsSpuFullReduction>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}