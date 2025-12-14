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
 * 招聘详情补充表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("recruitment_detail")
public class RecruitmentDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关联主表ID（对应recruitment_info.id）
     */
    private Integer jobId;

    /**
     * 任职要求（如"18-45岁，会用手机"）
     */
    private String requirements;

    /**
     * 工作详情（如"每日工作8小时，中午休息1小时"）
     */
    private String workDetails;

    /**
     * 联系人姓名（如"王经理"）
     */
    private String contactName;

    /**
     * 联系人电话（如"138-1234-5678"）
     */
    private String contactPhone;

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
