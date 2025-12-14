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
 * 公告评论表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("announcement_comment")
public class AnnouncementComment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关联公告ID（对应village_announcement.id）
     */
    private Integer annId;

    /**
     * 评论人ID（关联cct_user.user_id）
     */
    private Integer commentUserId;

    /**
     * 评论人昵称 
     */
    private String commentNick;

    /**
     * 评论内容 
     */
    private String commentText;

    /**
     * 点赞数（初始0）
     */
    private Integer likeCount;

    /**
     * 回复的目标评论ID（0为顶级评论）
     */
    private Integer replyTo;

    /**
     * 评论发布时间
     */
    private LocalDateTime commentTime;

    /**
     * 是否删除（0未删 1已删，逻辑删除）
     */
    private Boolean isDeleted;


}
