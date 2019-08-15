package com.leeyunt.blogapi.service.impl;

import com.leeyunt.blogapi.entity.Comment;
import com.leeyunt.blogapi.mapper.CommentMapper;
import com.leeyunt.blogapi.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-15
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
