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
 * 用户通讯录表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("user_contact")
public class UserContact implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID（关联cct_user.user_id）
     */
    private Integer userId;

    /**
     * 联系人姓名（如"张大爷"）
     */
    private String contactName;

    /**
     * 联系人电话（必填）
     */
    private String contactPhone;

    /**
     * 备注（如"住村西头"）
     */
    private String remark;

    /**
     * 添加时间
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
