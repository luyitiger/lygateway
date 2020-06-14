package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsSeckillSkuRelationDao;
import com.luyigu.gmall.sms.entity.SmsSeckillSkuRelation;
import com.luyigu.gmall.sms.service.SmsSeckillSkuRelationService;

@Service("smsSeckillSkuRelationService")
public class SmsSeckillSkuRelationServiceImpl extends ServiceImpl<SmsSeckillSkuRelationDao, SmsSeckillSkuRelation> implements SmsSeckillSkuRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsSeckillSkuRelation> page = this.page(
                new Query<SmsSeckillSkuRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}