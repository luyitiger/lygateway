package com.luyigu.gmall.wms.dao;

import com.luyigu.gmall.wms.entity.WareSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * @author jiangli
 * @since  2020-06-14 16:39:48
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSku> {
	
}
