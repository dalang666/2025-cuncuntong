package com.cuncuntong.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 鸡蛋奖励记录表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("egg_reward")
public class EggReward implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID（关联cct_user.user_id，自增主键）
     */
    private Integer userId;

    /**
     * 当前持有鸡蛋数（如9个）
     */
    private Integer currentEggs;

    /**
     * 累计获得鸡蛋数（如15个）
     */
    private Integer totalEggs;

    /**
     * 上次兑换时间（满10个兑换，如2025-08-20 10:00:00）
     */
    private LocalDateTime lastExchangeTime;

    /**
     * 今日通过广告获得的鸡蛋数（上限5）
     */
    private Integer todayAdCount;

    /**
     * 每日广告领取上限（如1个）
     */
    private Integer dailyAdLimit;

    /**
     * 上次领广告鸡蛋时间（防重复领取）
     */
    private LocalDateTime lastAdTime;

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
