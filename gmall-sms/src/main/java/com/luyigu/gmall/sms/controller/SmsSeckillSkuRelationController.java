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

import com.luyigu.gmall.sms.entity.SmsSeckillSkuRelation;
import com.luyigu.gmall.sms.service.SmsSeckillSkuRelationService;

/**
 * 秒杀活动商品关联
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "秒杀活动商品关联 管理")
@RestController
@RequestMapping("sms/smsseckillskurelation")
public class SmsSeckillSkuRelationController {
    @Autowired
    private SmsSeckillSkuRelationService smsSeckillSkuRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smsseckillskurelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsSeckillSkuRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smsseckillskurelation:info')")
    public Resp<SmsSeckillSkuRelation> info(@PathVariable("id") Long id){
		SmsSeckillSkuRelation smsSeckillSkuRelation = smsSeckillSkuRelationService.getById(id);

        return Resp.ok(smsSeckillSkuRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smsseckillskurelation:save')")
    public Resp<Object> save(@RequestBody SmsSeckillSkuRelation smsSeckillSkuRelation){
		smsSeckillSkuRelationService.save(smsSeckillSkuRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smsseckillskurelation:update')")
    public Resp<Object> update(@RequestBody SmsSeckillSkuRelation smsSeckillSkuRelation){
		smsSeckillSkuRelationService.updateById(smsSeckillSkuRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smsseckillskurelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsSeckillSkuRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
