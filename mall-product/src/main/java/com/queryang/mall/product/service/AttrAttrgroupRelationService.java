package com.queryang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.queryang.common.utils.PageUtils;
import com.queryang.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author wuyang
 * @email query_yang@outlook.com
 * @date 2024-08-04 17:41:52
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

