package com.leeyunt.blogapi.service.impl;

import com.leeyunt.blogapi.entity.Tag;
import com.leeyunt.blogapi.mapper.TagMapper;
import com.leeyunt.blogapi.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章标签表 服务实现类
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-13
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
