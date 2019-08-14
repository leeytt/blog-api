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
 * 评论表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comment对象", description="评论表")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "评论id")
    @TableId(value = "comment_id", type = IdType.AUTO)
    private Integer commentId;

    @ApiModelProperty(value = "文章id")
    private Integer articleId;

    @ApiModelProperty(value = "父id, 默认0")
    private Integer parentId;

    @ApiModelProperty(value = "回复的评论id")
    private Integer replyId;

    @ApiModelProperty(value = "评论者名称")
    private String coname;

    @ApiModelProperty(value = "评论者邮箱")
    private String email;

    @ApiModelProperty(value = "评论内容json")
    private String content;

    @ApiModelProperty(value = "评论内容（原始内容）")
    private String sourceContent;

    @ApiModelProperty(value = "状态，1-正常，0-删除，默认1")
    private Boolean status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "删除时间")
    private LocalDateTime deleteTime;

    @ApiModelProperty(value = "是否是作者，1-是，0-否，默认0")
    private Boolean isAuthor;


}
