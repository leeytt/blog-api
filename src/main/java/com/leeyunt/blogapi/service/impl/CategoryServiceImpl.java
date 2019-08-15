package com.leeyunt.blogapi.service.impl;

import com.leeyunt.blogapi.entity.Category;
import com.leeyunt.blogapi.mapper.CategoryMapper;
import com.leeyunt.blogapi.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章分类表 服务实现类
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-15
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
