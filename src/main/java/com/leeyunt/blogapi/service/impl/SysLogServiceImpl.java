package com.leeyunt.blogapi.service.impl;

import com.leeyunt.blogapi.entity.SysLog;
import com.leeyunt.blogapi.mapper.SysLogMapper;
import com.leeyunt.blogapi.service.SysLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志表 服务实现类
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-15
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {

}
