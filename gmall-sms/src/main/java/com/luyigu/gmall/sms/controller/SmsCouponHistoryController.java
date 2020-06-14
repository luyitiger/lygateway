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

import com.luyigu.gmall.sms.entity.SmsCouponHistory;
import com.luyigu.gmall.sms.service.SmsCouponHistoryService;

/**
 * 优惠券领取历史记录
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Api(tags = "优惠券领取历史记录 管理")
@RestController
@RequestMapping("sms/smscouponhistory")
public class SmsCouponHistoryController {
    @Autowired
    private SmsCouponHistoryService smsCouponHistoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smscouponhistory:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsCouponHistoryService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smscouponhistory:info')")
    public Resp<SmsCouponHistory> info(@PathVariable("id") Long id){
		SmsCouponHistory smsCouponHistory = smsCouponHistoryService.getById(id);

        return Resp.ok(smsCouponHistory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smscouponhistory:save')")
    public Resp<Object> save(@RequestBody SmsCouponHistory smsCouponHistory){
		smsCouponHistoryService.save(smsCouponHistory);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smscouponhistory:update')")
    public Resp<Object> update(@RequestBody SmsCouponHistory smsCouponHistory){
		smsCouponHistoryService.updateById(smsCouponHistory);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smscouponhistory:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsCouponHistoryService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
