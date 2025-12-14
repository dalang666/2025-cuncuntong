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
 * 用户抽奖记录表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("lottery_record")
public class LotteryRecord implements Serializable {

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
     * 使用的抽奖码（关联user_lottery_code.lottery_code）
     */
    private String lotteryCode;

    /**
     * 中奖奖品ID（关联lottery_prize.id，0为未中奖）
     */
    private Integer prizeId;

    /**
     * 抽奖时间（自动记录）
     */
    private LocalDateTime lotteryTime;

    /**
     * 是否中奖（0-未中 1-中奖）
     */
    private Boolean isWin;

    /**
     * 中奖时间（中奖时记录）
     */
    private LocalDateTime winTime;

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
