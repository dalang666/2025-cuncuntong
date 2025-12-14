package com.cuncuntong.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 抽奖活动奖品表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("lottery_prize")
public class LotteryPrize implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 奖品名称（如"5L食用油"）
     */
    private String prizeName;

    /**
     * 奖品类型（1:实物 2:虚拟券 3:话费）
     */
    private Boolean prizeType;

    /**
     * 奖品图片URL（展示用）
     */
    private String prizeImage;

    /**
     * 可兑换开始日期
     */
    private LocalDate startDate;

    /**
     * 可兑换结束日期
     */
    private LocalDate endDate;

    /**
     * 奖品剩余库存（如100份）
     */
    private Integer stock;

    /**
     * 总奖池数量（如6种奖品）
     */
    private Integer totalPrize;

    /**
     * 中奖概率（如0.0500表示5%）
     */
    private BigDecimal probability;

    /**
     * 奖品创建时间
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
