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

import com.luyigu.gmall.sms.entity.SmsSkuBounds;
import com.luyigu.gmall.sms.service.SmsSkuBoundsService;

/**
 * 商品sku积分设置
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "商品sku积分设置 管理")
@RestController
@RequestMapping("sms/smsskubounds")
public class SmsSkuBoundsController {
    @Autowired
    private SmsSkuBoundsService smsSkuBoundsService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smsskubounds:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsSkuBoundsService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smsskubounds:info')")
    public Resp<SmsSkuBounds> info(@PathVariable("id") Long id){
		SmsSkuBounds smsSkuBounds = smsSkuBoundsService.getById(id);

        return Resp.ok(smsSkuBounds);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smsskubounds:save')")
    public Resp<Object> save(@RequestBody SmsSkuBounds smsSkuBounds){
		smsSkuBoundsService.save(smsSkuBounds);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smsskubounds:update')")
    public Resp<Object> update(@RequestBody SmsSkuBounds smsSkuBounds){
		smsSkuBoundsService.updateById(smsSkuBounds);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smsskubounds:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsSkuBoundsService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
