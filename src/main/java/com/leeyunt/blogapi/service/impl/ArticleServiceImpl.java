package com.leeyunt.blogapi.service.impl;

import com.leeyunt.blogapi.entity.Article;
import com.leeyunt.blogapi.mapper.ArticleMapper;
import com.leeyunt.blogapi.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-15
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
