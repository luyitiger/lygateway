package com.luyigu.gmall.oms.controller;

import java.util.Arrays;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.luyigu.gmall.oms.entity.OmsOrderSetting;
import com.luyigu.gmall.oms.service.OmsOrderSettingService;

/**
 * 订单配置信息
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
@Api(tags = "订单配置信息 管理")
@RestController
@RequestMapping("oms/omsordersetting")
public class OmsOrderSettingController {
    @Autowired
    private OmsOrderSettingService omsOrderSettingService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('oms:omsordersetting:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = omsOrderSettingService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('oms:omsordersetting:info')")
    public Resp<OmsOrderSetting> info(@PathVariable("id") Long id){
		OmsOrderSetting omsOrderSetting = omsOrderSettingService.getById(id);

        return Resp.ok(omsOrderSetting);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('oms:omsordersetting:save')")
    public Resp<Object> save(@RequestBody OmsOrderSetting omsOrderSetting){
		omsOrderSettingService.save(omsOrderSetting);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('oms:omsordersetting:update')")
    public Resp<Object> update(@RequestBody OmsOrderSetting omsOrderSetting){
		omsOrderSettingService.updateById(omsOrderSetting);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('oms:omsordersetting:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		omsOrderSettingService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
