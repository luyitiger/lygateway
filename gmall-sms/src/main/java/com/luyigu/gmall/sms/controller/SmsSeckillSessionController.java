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

import com.luyigu.gmall.sms.entity.SmsSeckillSession;
import com.luyigu.gmall.sms.service.SmsSeckillSessionService;

/**
 * 秒杀活动场次
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "秒杀活动场次 管理")
@RestController
@RequestMapping("sms/smsseckillsession")
public class SmsSeckillSessionController {
    @Autowired
    private SmsSeckillSessionService smsSeckillSessionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smsseckillsession:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsSeckillSessionService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smsseckillsession:info')")
    public Resp<SmsSeckillSession> info(@PathVariable("id") Long id){
		SmsSeckillSession smsSeckillSession = smsSeckillSessionService.getById(id);

        return Resp.ok(smsSeckillSession);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smsseckillsession:save')")
    public Resp<Object> save(@RequestBody SmsSeckillSession smsSeckillSession){
		smsSeckillSessionService.save(smsSeckillSession);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smsseckillsession:update')")
    public Resp<Object> update(@RequestBody SmsSeckillSession smsSeckillSession){
		smsSeckillSessionService.updateById(smsSeckillSession);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smsseckillsession:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsSeckillSessionService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
