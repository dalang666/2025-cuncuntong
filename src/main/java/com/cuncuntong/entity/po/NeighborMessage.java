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
 * 邻里邻外消息通知表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("neighbor_message")
public class NeighborMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 接收用户ID（关联cct_user.user_id）
     */
    private Integer receiverId;

    /**
     * 发送用户ID（关联cct_user.user_id）
     */
    private Integer senderId;

    /**
     * 消息类型（0:设备求助 1:收购需求 2:服务推荐）
     */
    private Boolean msgType;

    /**
     * 消息内容（如"我有玉米需要收购，联系138..."）
     */
    private String msgContent;

    /**
     * 关联业务ID（如服务表id/需求表id）
     */
    private Integer relatedId;

    /**
     * 是否已读（0未读 1已读）
     */
    private Boolean isRead;

    /**
     * 发送时间（自动记录）
     */
    private LocalDateTime sendTime;

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
