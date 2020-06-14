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

import com.luyigu.gmall.sms.entity.SmsSkuLadder;
import com.luyigu.gmall.sms.service.SmsSkuLadderService;

/**
 * 商品阶梯价格
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "商品阶梯价格 管理")
@RestController
@RequestMapping("sms/smsskuladder")
public class SmsSkuLadderController {
    @Autowired
    private SmsSkuLadderService smsSkuLadderService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smsskuladder:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsSkuLadderService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smsskuladder:info')")
    public Resp<SmsSkuLadder> info(@PathVariable("id") Long id){
		SmsSkuLadder smsSkuLadder = smsSkuLadderService.getById(id);

        return Resp.ok(smsSkuLadder);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smsskuladder:save')")
    public Resp<Object> save(@RequestBody SmsSkuLadder smsSkuLadder){
		smsSkuLadderService.save(smsSkuLadder);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smsskuladder:update')")
    public Resp<Object> update(@RequestBody SmsSkuLadder smsSkuLadder){
		smsSkuLadderService.updateById(smsSkuLadder);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smsskuladder:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsSkuLadderService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
