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

import com.luyigu.gmall.sms.entity.SmsHomeSubjectSpu;
import com.luyigu.gmall.sms.service.SmsHomeSubjectSpuService;

/**
 * 专题商品
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "专题商品 管理")
@RestController
@RequestMapping("sms/smshomesubjectspu")
public class SmsHomeSubjectSpuController {
    @Autowired
    private SmsHomeSubjectSpuService smsHomeSubjectSpuService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smshomesubjectspu:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsHomeSubjectSpuService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smshomesubjectspu:info')")
    public Resp<SmsHomeSubjectSpu> info(@PathVariable("id") Long id){
		SmsHomeSubjectSpu smsHomeSubjectSpu = smsHomeSubjectSpuService.getById(id);

        return Resp.ok(smsHomeSubjectSpu);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smshomesubjectspu:save')")
    public Resp<Object> save(@RequestBody SmsHomeSubjectSpu smsHomeSubjectSpu){
		smsHomeSubjectSpuService.save(smsHomeSubjectSpu);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smshomesubjectspu:update')")
    public Resp<Object> update(@RequestBody SmsHomeSubjectSpu smsHomeSubjectSpu){
		smsHomeSubjectSpuService.updateById(smsHomeSubjectSpu);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smshomesubjectspu:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsHomeSubjectSpuService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
