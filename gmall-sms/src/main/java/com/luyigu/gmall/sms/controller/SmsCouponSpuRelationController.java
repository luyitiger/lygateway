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

import com.luyigu.gmall.sms.entity.SmsCouponSpuRelation;
import com.luyigu.gmall.sms.service.SmsCouponSpuRelationService;

/**
 * 优惠券与产品关联
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "优惠券与产品关联 管理")
@RestController
@RequestMapping("sms/smscouponspurelation")
public class SmsCouponSpuRelationController {
    @Autowired
    private SmsCouponSpuRelationService smsCouponSpuRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smscouponspurelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsCouponSpuRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smscouponspurelation:info')")
    public Resp<SmsCouponSpuRelation> info(@PathVariable("id") Long id){
		SmsCouponSpuRelation smsCouponSpuRelation = smsCouponSpuRelationService.getById(id);

        return Resp.ok(smsCouponSpuRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smscouponspurelation:save')")
    public Resp<Object> save(@RequestBody SmsCouponSpuRelation smsCouponSpuRelation){
		smsCouponSpuRelationService.save(smsCouponSpuRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smscouponspurelation:update')")
    public Resp<Object> update(@RequestBody SmsCouponSpuRelation smsCouponSpuRelation){
		smsCouponSpuRelationService.updateById(smsCouponSpuRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smscouponspurelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsCouponSpuRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
