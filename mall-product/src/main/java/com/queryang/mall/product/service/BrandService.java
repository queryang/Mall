package com.queryang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.queryang.common.utils.PageUtils;
import com.queryang.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wuyang
 * @email query_yang@outlook.com
 * @date 2024-08-04 17:41:52
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

