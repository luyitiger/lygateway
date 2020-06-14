package com.luyigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.ums.entity.MemberStatisticsInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员统计信息
 *
 * @author jiangli
 * @since  2020-06-14 16:27:23
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfo> {

    PageVo queryPage(QueryCondition params);
}

