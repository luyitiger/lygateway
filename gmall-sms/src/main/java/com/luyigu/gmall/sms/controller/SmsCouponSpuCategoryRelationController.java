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

import com.luyigu.gmall.sms.entity.SmsCouponSpuCategoryRelation;
import com.luyigu.gmall.sms.service.SmsCouponSpuCategoryRelationService;

/**
 * 优惠券分类关联
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "优惠券分类关联 管理")
@RestController
@RequestMapping("sms/smscouponspucategoryrelation")
public class SmsCouponSpuCategoryRelationController {
    @Autowired
    private SmsCouponSpuCategoryRelationService smsCouponSpuCategoryRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smscouponspucategoryrelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsCouponSpuCategoryRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smscouponspucategoryrelation:info')")
    public Resp<SmsCouponSpuCategoryRelation> info(@PathVariable("id") Long id){
		SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation = smsCouponSpuCategoryRelationService.getById(id);

        return Resp.ok(smsCouponSpuCategoryRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smscouponspucategoryrelation:save')")
    public Resp<Object> save(@RequestBody SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation){
		smsCouponSpuCategoryRelationService.save(smsCouponSpuCategoryRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smscouponspucategoryrelation:update')")
    public Resp<Object> update(@RequestBody SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation){
		smsCouponSpuCategoryRelationService.updateById(smsCouponSpuCategoryRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smscouponspucategoryrelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsCouponSpuCategoryRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
