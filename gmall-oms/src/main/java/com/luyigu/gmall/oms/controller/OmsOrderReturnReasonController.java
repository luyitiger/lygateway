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

import com.luyigu.gmall.oms.entity.OmsOrderReturnReason;
import com.luyigu.gmall.oms.service.OmsOrderReturnReasonService;

/**
 * 退货原因
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
@Api(tags = "退货原因 管理")
@RestController
@RequestMapping("oms/omsorderreturnreason")
public class OmsOrderReturnReasonController {
    @Autowired
    private OmsOrderReturnReasonService omsOrderReturnReasonService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('oms:omsorderreturnreason:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = omsOrderReturnReasonService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('oms:omsorderreturnreason:info')")
    public Resp<OmsOrderReturnReason> info(@PathVariable("id") Long id){
		OmsOrderReturnReason omsOrderReturnReason = omsOrderReturnReasonService.getById(id);

        return Resp.ok(omsOrderReturnReason);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('oms:omsorderreturnreason:save')")
    public Resp<Object> save(@RequestBody OmsOrderReturnReason omsOrderReturnReason){
		omsOrderReturnReasonService.save(omsOrderReturnReason);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('oms:omsorderreturnreason:update')")
    public Resp<Object> update(@RequestBody OmsOrderReturnReason omsOrderReturnReason){
		omsOrderReturnReasonService.updateById(omsOrderReturnReason);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('oms:omsorderreturnreason:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		omsOrderReturnReasonService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
