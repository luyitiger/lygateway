package com.luyigu.gmall.sms.controller;

import java.util.Arrays;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.luyigu.gmall.sms.entity.SmsHomeSubject;
import com.luyigu.gmall.sms.service.SmsHomeSubjectService;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 管理")
@RestController
@RequestMapping("sms/smshomesubject")
public class SmsHomeSubjectController {
    @Autowired
    private SmsHomeSubjectService smsHomeSubjectService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smshomesubject:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsHomeSubjectService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smshomesubject:info')")
    public Resp<SmsHomeSubject> info(@PathVariable("id") Long id){
		SmsHomeSubject smsHomeSubject = smsHomeSubjectService.getById(id);

        return Resp.ok(smsHomeSubject);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smshomesubject:save')")
    public Resp<Object> save(@RequestBody SmsHomeSubject smsHomeSubject){
		smsHomeSubjectService.save(smsHomeSubject);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smshomesubject:update')")
    public Resp<Object> update(@RequestBody SmsHomeSubject smsHomeSubject){
		smsHomeSubjectService.updateById(smsHomeSubject);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smshomesubject:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsHomeSubjectService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
