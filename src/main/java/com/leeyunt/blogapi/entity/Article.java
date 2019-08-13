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
 * 文章表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章分类id
     */
    private Integer categoryId;

    /**
     * 封面图url
     */
    private String cover;

    /**
     * 文章简介
     */
    private String subMessage;

    /**
     * 内容
     */
    private String content;

    /**
     * 生成的html
     */
    private String htmlContent;

    /**
     * 是否加密，1-是，0-否，默认0
     */
    private Boolean isEncrypt;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 提交时间
     */
    private LocalDateTime publishTime;

    /**
     * 删除时间
     */
    private LocalDateTime deleteTime;

    /**
     * 状态，1-正常（发布），0-删除，2-草稿（待发布）
     */
    private Boolean status;

    /**
     * 文章阅读数
     */
    private Integer pageview;


}
