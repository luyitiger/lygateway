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

import com.luyigu.gmall.sms.entity.SmsSeckillPromotion;
import com.luyigu.gmall.sms.service.SmsSeckillPromotionService;

/**
 * 秒杀活动
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "秒杀活动 管理")
@RestController
@RequestMapping("sms/smsseckillpromotion")
public class SmsSeckillPromotionController {
    @Autowired
    private SmsSeckillPromotionService smsSeckillPromotionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smsseckillpromotion:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsSeckillPromotionService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smsseckillpromotion:info')")
    public Resp<SmsSeckillPromotion> info(@PathVariable("id") Long id){
		SmsSeckillPromotion smsSeckillPromotion = smsSeckillPromotionService.getById(id);

        return Resp.ok(smsSeckillPromotion);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smsseckillpromotion:save')")
    public Resp<Object> save(@RequestBody SmsSeckillPromotion smsSeckillPromotion){
		smsSeckillPromotionService.save(smsSeckillPromotion);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smsseckillpromotion:update')")
    public Resp<Object> update(@RequestBody SmsSeckillPromotion smsSeckillPromotion){
		smsSeckillPromotionService.updateById(smsSeckillPromotion);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smsseckillpromotion:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsSeckillPromotionService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
