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
 * 招聘信息主表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("recruitment_info")
public class RecruitmentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 岗位名称（如"快递分拣员"）
     */
    private String jobName;

    /**
     * 薪资范围（如"2000-3000元/月"）
     */
    private String salaryRange;

    /**
     * 招聘人数（如5人）
     */
    private Integer hireCount;

    /**
     * 招聘企业（如"XX快递站点"）
     */
    private String companyName;

    /**
     * 工作地点（如"村东物流中心"）
     */
    private String workLocation;

    /**
     * 发布人ID（关联cct_user.user_id）
     */
    private Integer publisherId;

    /**
     * 发布时间（自动记录）
     */
    private LocalDateTime publishTime;

    /**
     * 招聘截止时间（如2025-09-15 18:00:00）
     */
    private LocalDateTime expireTime;

    /**
     * 是否急招（0否 1是）
     */
    private Boolean isUrgent;

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
