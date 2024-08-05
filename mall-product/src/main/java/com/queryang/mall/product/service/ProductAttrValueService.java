package com.queryang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.queryang.common.utils.PageUtils;
import com.queryang.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author wuyang
 * @email query_yang@outlook.com
 * @date 2024-08-04 17:41:52
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

