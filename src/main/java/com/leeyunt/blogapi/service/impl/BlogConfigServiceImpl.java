package com.leeyunt.blogapi.service.impl;

import com.leeyunt.blogapi.entity.BlogConfig;
import com.leeyunt.blogapi.mapper.BlogConfigMapper;
import com.leeyunt.blogapi.service.BlogConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客配置表 服务实现类
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-13
 */
@Service
public class BlogConfigServiceImpl extends ServiceImpl<BlogConfigMapper, BlogConfig> implements BlogConfigService {

}
