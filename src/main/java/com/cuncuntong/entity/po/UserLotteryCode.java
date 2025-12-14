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
 * 用户抽奖码记录表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("user_lottery_code")
public class UserLotteryCode implements Serializable {

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
     * 抽奖码（如"10021231"，唯一）
     */
    private String lotteryCode;

    /**
     * 获取方式（1:看广告 2:分享活动 3:做任务）
     */
    private Boolean getWay;

    /**
     * 获取时间（自动记录）
     */
    private LocalDateTime getTime;

    /**
     * 是否已使用（0未使用 1已使用）
     */
    private Boolean isUsed;

    /**
     * 使用时间（中奖后记录）
     */
    private LocalDateTime usedTime;

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
