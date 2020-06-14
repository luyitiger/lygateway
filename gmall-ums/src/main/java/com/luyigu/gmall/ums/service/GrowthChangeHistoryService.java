package com.luyigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.ums.entity.GrowthChangeHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 成长值变化历史记录
 *
 * @author jiangli
 * @since  2020-06-14 16:27:23
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistory> {

    PageVo queryPage(QueryCondition params);
}

