package com.luyigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.oms.dao.OmsOrderDao;
import com.luyigu.gmall.oms.entity.OmsOrder;
import com.luyigu.gmall.oms.service.OmsOrderService;

@Service("omsOrderService")
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderDao, OmsOrder> implements OmsOrderService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsOrder> page = this.page(
                new Query<OmsOrder>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}