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

import com.luyigu.gmall.oms.entity.OmsRefundInfo;
import com.luyigu.gmall.oms.service.OmsRefundInfoService;

/**
 * 退款信息
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
@Api(tags = "退款信息 管理")
@RestController
@RequestMapping("oms/omsrefundinfo")
public class OmsRefundInfoController {
    @Autowired
    private OmsRefundInfoService omsRefundInfoService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('oms:omsrefundinfo:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = omsRefundInfoService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('oms:omsrefundinfo:info')")
    public Resp<OmsRefundInfo> info(@PathVariable("id") Long id){
		OmsRefundInfo omsRefundInfo = omsRefundInfoService.getById(id);

        return Resp.ok(omsRefundInfo);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('oms:omsrefundinfo:save')")
    public Resp<Object> save(@RequestBody OmsRefundInfo omsRefundInfo){
		omsRefundInfoService.save(omsRefundInfo);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('oms:omsrefundinfo:update')")
    public Resp<Object> update(@RequestBody OmsRefundInfo omsRefundInfo){
		omsRefundInfoService.updateById(omsRefundInfo);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('oms:omsrefundinfo:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		omsRefundInfoService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
