package com.leeyunt.blogapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 友链类型表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="FriendurlType对象", description="友链类型表")
public class FriendurlType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "友链类型id")
    @TableId(value = "type_id", type = IdType.AUTO)
    private Integer typeId;

    @ApiModelProperty(value = "友链类型名称")
    private String name;

    @ApiModelProperty(value = "该类型的友链数量")
    private Integer friendCount;


}
