package com.luyigu.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.ums.dao.MemberDao;
import com.luyigu.gmall.ums.entity.Member;
import com.luyigu.gmall.ums.service.MemberService;

@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, Member> implements MemberService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<Member> page = this.page(
                new Query<Member>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}