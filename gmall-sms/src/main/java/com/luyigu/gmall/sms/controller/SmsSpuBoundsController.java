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

import com.luyigu.gmall.sms.entity.SmsSpuBounds;
import com.luyigu.gmall.sms.service.SmsSpuBoundsService;

/**
 * 商品spu积分设置
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "商品spu积分设置 管理")
@RestController
@RequestMapping("sms/smsspubounds")
public class SmsSpuBoundsController {
    @Autowired
    private SmsSpuBoundsService smsSpuBoundsService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smsspubounds:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsSpuBoundsService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smsspubounds:info')")
    public Resp<SmsSpuBounds> info(@PathVariable("id") Long id){
		SmsSpuBounds smsSpuBounds = smsSpuBoundsService.getById(id);

        return Resp.ok(smsSpuBounds);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smsspubounds:save')")
    public Resp<Object> save(@RequestBody SmsSpuBounds smsSpuBounds){
		smsSpuBoundsService.save(smsSpuBounds);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smsspubounds:update')")
    public Resp<Object> update(@RequestBody SmsSpuBounds smsSpuBounds){
		smsSpuBoundsService.updateById(smsSpuBounds);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smsspubounds:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsSpuBoundsService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
