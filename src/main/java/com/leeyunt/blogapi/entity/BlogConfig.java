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
 * 博客配置表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="BlogConfig对象", description="博客配置表")
public class BlogConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "博客名称")
    private String blogName;

    @ApiModelProperty(value = "头像url")
    private String avatar;

    @ApiModelProperty(value = "个性签名")
    private String sign;

    @ApiModelProperty(value = "微信支付二维码url")
    private String wxpayQrcode;

    @ApiModelProperty(value = "支付宝支付二维码url")
    private String alipayQrcode;

    @ApiModelProperty(value = "github url")
    private String github;

    @ApiModelProperty(value = "阅读加密密码")
    private String viewPassword;

    @ApiModelProperty(value = "阅读加密秘钥")
    private String salt;


}
