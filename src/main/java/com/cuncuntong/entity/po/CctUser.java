package com.cuncuntong.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("cct_user")
public class CctUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户业务ID（唯一标识，如10001）
     */
    private Integer userId;

    /**
     * 用户昵称（如"xxx"）
     */
    private String userName;

    /**
     * 注册手机号（用于登录）
     */
    private String phone;

    /**
     * 居住地址（如"XX村"）
     */
    private String address;

    /**
     * 用户头像URL
     */
    private String avatarUrl;

    /**
     * 账号创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 是否删除（0未删 1已删，逻辑删除）
     */
    private Boolean isDeleted;


}
