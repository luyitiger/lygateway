package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsCategoryBoundsDao;
import com.luyigu.gmall.sms.entity.SmsCategoryBounds;
import com.luyigu.gmall.sms.service.SmsCategoryBoundsService;

@Service("smsCategoryBoundsService")
public class SmsCategoryBoundsServiceImpl extends ServiceImpl<SmsCategoryBoundsDao, SmsCategoryBounds> implements SmsCategoryBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsCategoryBounds> page = this.page(
                new Query<SmsCategoryBounds>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}