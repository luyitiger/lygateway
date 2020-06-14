package com.luyigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.oms.dao.OmsOrderReturnReasonDao;
import com.luyigu.gmall.oms.entity.OmsOrderReturnReason;
import com.luyigu.gmall.oms.service.OmsOrderReturnReasonService;

@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonDao, OmsOrderReturnReason> implements OmsOrderReturnReasonService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsOrderReturnReason> page = this.page(
                new Query<OmsOrderReturnReason>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}