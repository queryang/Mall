package com.queryang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.queryang.common.utils.PageUtils;
import com.queryang.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author wuyang
 * @email query_yang@outlook.com
 * @date 2024-08-04 17:41:51
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

