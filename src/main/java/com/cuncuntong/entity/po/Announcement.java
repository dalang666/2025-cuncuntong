package com.cuncuntong.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 村公告信息表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
public class Announcement implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 公告标题（如"关于快递代取服务的通知"）
     */
    private String annTitle;

    /**
     * 公告正文内容（长文本，含具体通知细节）
     */
    private String annContent;

    /**
     * 发布人ID（关联cct_user.user_id）
     */
    private Integer publisherId;

    /**
     * 发布时间（自动记录）
     */
    private LocalDateTime publishTime;

    /**
     * 公告失效时间（如2025-09-30 23:59:59）
     */
    private LocalDateTime expireTime;

    /**
     * 是否置顶（0否 1是）
     */
    private Boolean isTop;

    /**
     * 记录创建时间
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
