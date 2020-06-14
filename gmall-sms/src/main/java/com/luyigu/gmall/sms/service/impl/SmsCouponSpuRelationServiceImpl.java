package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsCouponSpuRelationDao;
import com.luyigu.gmall.sms.entity.SmsCouponSpuRelation;
import com.luyigu.gmall.sms.service.SmsCouponSpuRelationService;

@Service("smsCouponSpuRelationService")
public class SmsCouponSpuRelationServiceImpl extends ServiceImpl<SmsCouponSpuRelationDao, SmsCouponSpuRelation> implements SmsCouponSpuRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsCouponSpuRelation> page = this.page(
                new Query<SmsCouponSpuRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}