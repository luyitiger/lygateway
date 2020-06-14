package com.luyigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.oms.dao.OmsOrderReturnApplyDao;
import com.luyigu.gmall.oms.entity.OmsOrderReturnApply;
import com.luyigu.gmall.oms.service.OmsOrderReturnApplyService;

@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl extends ServiceImpl<OmsOrderReturnApplyDao, OmsOrderReturnApply> implements OmsOrderReturnApplyService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsOrderReturnApply> page = this.page(
                new Query<OmsOrderReturnApply>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}