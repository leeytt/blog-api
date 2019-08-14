package com.leeyunt.blogapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Article对象", description="文章表")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文章id")
    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;

    @ApiModelProperty(value = "文章标题")
    private String title;

    @ApiModelProperty(value = "文章分类id")
    private Integer categoryId;

    @ApiModelProperty(value = "封面图url")
    private String cover;

    @ApiModelProperty(value = "文章简介")
    private String subMessage;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "生成的html")
    private String htmlContent;

    @ApiModelProperty(value = "是否加密，1-是，0-否，默认0")
    private Boolean isEncrypt;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "提交时间")
    private LocalDateTime publishTime;

    @ApiModelProperty(value = "删除时间")
    private LocalDateTime deleteTime;

    @ApiModelProperty(value = "状态，1-正常（发布），0-删除，2-草稿（待发布）")
    private Boolean status;

    @ApiModelProperty(value = "文章阅读数")
    private Integer pageview;


}
