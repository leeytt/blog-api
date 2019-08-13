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
 * 评论表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
    @TableId(value = "comment_id", type = IdType.AUTO)
    private Integer commentId;

    /**
     * 文章id
     */
    private Integer articleId;

    /**
     * 父id, 默认0
     */
    private Integer parentId;

    /**
     * 回复的评论id
     */
    private Integer replyId;

    /**
     * 评论者名称
     */
    private String coname;

    /**
     * 评论者邮箱
     */
    private String email;

    /**
     * 评论内容json
     */
    private String content;

    /**
     * 评论内容（原始内容）
     */
    private String sourceContent;

    /**
     * 状态，1-正常，0-删除，默认1
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 删除时间
     */
    private LocalDateTime deleteTime;

    /**
     * 是否是作者，1-是，0-否，默认0
     */
    private Boolean isAuthor;


}
