package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.CommentReplay;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品评价回复关系
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface CommentReplayService extends IService<CommentReplay> {

    PageVo queryPage(QueryCondition params);
}

