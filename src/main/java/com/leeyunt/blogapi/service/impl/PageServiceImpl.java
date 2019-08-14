package com.leeyunt.blogapi.service.impl;

import com.leeyunt.blogapi.entity.Page;
import com.leeyunt.blogapi.mapper.PageMapper;
import com.leeyunt.blogapi.service.PageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 页面渲染表 服务实现类
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-14
 */
@Service
public class PageServiceImpl extends ServiceImpl<PageMapper, Page> implements PageService {

}
