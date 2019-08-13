package com.leeyunt.blogapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 友链表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Friendurl implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 友链id
     */
    @TableId(value = "friendurl_id", type = IdType.AUTO)
    private Integer friendurlId;

    /**
     * 友链名称
     */
    private String name;

    /**
     * 对应链接
     */
    private String url;

    /**
     * 友链类型id
     */
    private Integer typeId;

    /**
     * 状态，1-可用，0-删除，默认1
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 删除时间
     */
    private LocalDateTime deleteTime;


}
