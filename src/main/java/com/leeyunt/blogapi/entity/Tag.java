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
 * 文章标签表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Tag对象", description="文章标签表")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标签id")
    @TableId(value = "tag_id", type = IdType.AUTO)
    private Integer tagId;

    @ApiModelProperty(value = "标签名称")
    private String name;

    @ApiModelProperty(value = "状态，1-正常，0-删除，默认1")
    private Boolean status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "能否删除，1-可删除，0-不可删除，默认1")
    private Boolean canDel;

    @ApiModelProperty(value = "该标签的文章数量")
    private Integer articleCount;


}
