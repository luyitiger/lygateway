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

import com.luyigu.gmall.sms.entity.SmsSeckillSkuNotice;
import com.luyigu.gmall.sms.service.SmsSeckillSkuNoticeService;

/**
 * 秒杀商品通知订阅
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "秒杀商品通知订阅 管理")
@RestController
@RequestMapping("sms/smsseckillskunotice")
public class SmsSeckillSkuNoticeController {
    @Autowired
    private SmsSeckillSkuNoticeService smsSeckillSkuNoticeService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smsseckillskunotice:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsSeckillSkuNoticeService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smsseckillskunotice:info')")
    public Resp<SmsSeckillSkuNotice> info(@PathVariable("id") Long id){
		SmsSeckillSkuNotice smsSeckillSkuNotice = smsSeckillSkuNoticeService.getById(id);

        return Resp.ok(smsSeckillSkuNotice);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smsseckillskunotice:save')")
    public Resp<Object> save(@RequestBody SmsSeckillSkuNotice smsSeckillSkuNotice){
		smsSeckillSkuNoticeService.save(smsSeckillSkuNotice);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smsseckillskunotice:update')")
    public Resp<Object> update(@RequestBody SmsSeckillSkuNotice smsSeckillSkuNotice){
		smsSeckillSkuNoticeService.updateById(smsSeckillSkuNotice);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smsseckillskunotice:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsSeckillSkuNoticeService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
