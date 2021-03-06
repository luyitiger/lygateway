package com.luyigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.oms.dao.OmsOrderItemDao;
import com.luyigu.gmall.oms.entity.OmsOrderItem;
import com.luyigu.gmall.oms.service.OmsOrderItemService;

@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemDao, OmsOrderItem> implements OmsOrderItemService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsOrderItem> page = this.page(
                new Query<OmsOrderItem>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}