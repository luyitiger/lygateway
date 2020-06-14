package com.luyigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.ums.entity.MemberCollectSpu;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员收藏的商品
 *
 * @author jiangli
 * @since  2020-06-14 16:27:23
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpu> {

    PageVo queryPage(QueryCondition params);
}

