package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsCouponSpuCategoryRelationDao;
import com.luyigu.gmall.sms.entity.SmsCouponSpuCategoryRelation;
import com.luyigu.gmall.sms.service.SmsCouponSpuCategoryRelationService;

@Service("smsCouponSpuCategoryRelationService")
public class SmsCouponSpuCategoryRelationServiceImpl extends ServiceImpl<SmsCouponSpuCategoryRelationDao, SmsCouponSpuCategoryRelation> implements SmsCouponSpuCategoryRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsCouponSpuCategoryRelation> page = this.page(
                new Query<SmsCouponSpuCategoryRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}