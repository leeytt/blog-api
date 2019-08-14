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
 * 页面渲染表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Page对象", description="页面渲染表")
public class Page implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "页面名称")
    private String paname;

    @ApiModelProperty(value = "markdown内容")
    private String mdContent;

    @ApiModelProperty(value = "生成的html内容")
    private String htmlContent;


}
