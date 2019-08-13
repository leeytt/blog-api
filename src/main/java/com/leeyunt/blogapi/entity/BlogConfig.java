package com.leeyunt.blogapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 博客配置表
 * </p>
 *
 * @author leeyunt
 * @since 2019-08-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BlogConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 博客名称
     */
    private String blogName;

    /**
     * 头像url
     */
    private String avatar;

    /**
     * 个性签名
     */
    private String sign;

    /**
     * 微信支付二维码url
     */
    private String wxpayQrcode;

    /**
     * 支付宝支付二维码url
     */
    private String alipayQrcode;

    /**
     * github url
     */
    private String github;

    /**
     * 阅读加密密码
     */
    private String viewPassword;

    /**
     * 阅读加密秘钥
     */
    private String salt;


}
