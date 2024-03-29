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
 * 友链表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Friendurl对象", description="友链表")
public class Friendurl implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "友链id")
    @TableId(value = "friendurl_id", type = IdType.AUTO)
    private Integer friendurlId;

    @ApiModelProperty(value = "友链名称")
    private String name;

    @ApiModelProperty(value = "对应链接")
    private String url;

    @ApiModelProperty(value = "友链类型id")
    private Integer typeId;

    @ApiModelProperty(value = "状态，1-可用，0-删除，默认1")
    private Boolean status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除时间")
    private LocalDateTime deleteTime;


}
