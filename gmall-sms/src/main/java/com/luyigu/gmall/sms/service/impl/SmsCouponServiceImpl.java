package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsCouponDao;
import com.luyigu.gmall.sms.entity.SmsCoupon;
import com.luyigu.gmall.sms.service.SmsCouponService;

@Service("smsCouponService")
public class SmsCouponServiceImpl extends ServiceImpl<SmsCouponDao, SmsCoupon> implements SmsCouponService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsCoupon> page = this.page(
                new Query<SmsCoupon>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}