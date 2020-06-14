package com.luyigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.ums.dao.MemberCollectSpuDao;
import com.luyigu.gmall.ums.entity.MemberCollectSpu;
import com.luyigu.gmall.ums.service.MemberCollectSpuService;

@Service("memberCollectSpuService")
public class MemberCollectSpuServiceImpl extends ServiceImpl<MemberCollectSpuDao, MemberCollectSpu> implements MemberCollectSpuService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberCollectSpu> page = this.page(
                new Query<MemberCollectSpu>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}