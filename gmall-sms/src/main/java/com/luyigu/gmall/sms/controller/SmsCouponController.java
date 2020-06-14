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

import com.luyigu.gmall.sms.entity.SmsCoupon;
import com.luyigu.gmall.sms.service.SmsCouponService;

/**
 * 优惠券信息
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "优惠券信息 管理")
@RestController
@RequestMapping("sms/smscoupon")
public class SmsCouponController {
    @Autowired
    private SmsCouponService smsCouponService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smscoupon:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsCouponService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smscoupon:info')")
    public Resp<SmsCoupon> info(@PathVariable("id") Long id){
		SmsCoupon smsCoupon = smsCouponService.getById(id);

        return Resp.ok(smsCoupon);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smscoupon:save')")
    public Resp<Object> save(@RequestBody SmsCoupon smsCoupon){
		smsCouponService.save(smsCoupon);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smscoupon:update')")
    public Resp<Object> update(@RequestBody SmsCoupon smsCoupon){
		smsCouponService.updateById(smsCoupon);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smscoupon:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsCouponService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
