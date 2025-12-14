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
 * 邻里邻外功能服务表
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Getter
@Setter
@TableName("neighbor_service")
public class NeighborService implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 服务类型（1:农用设备 2:联合收割机 3:种子/农药 4:粮食收购）
     */
    private Boolean serviceType;

    /**
     * 服务名称（如"农用无人机租赁"）
     */
    private String serviceName;

    /**
     * 服务描述（如"提供无人机喷洒农药服务，每亩50元"）
     */
    private String serviceDesc;

    /**
     * 服务提供人ID（关联cct_user.user_id）
     */
    private Integer providerId;

    /**
     * 服务联系电话（必填）
     */
    private String contactPhone;

    /**
     * 服务封面图URL（展示用）
     */
    private String coverImg;

    /**
     * 是否可用（0下架 1上架）
     */
    private Boolean isAvailable;

    /**
     * 发布时间
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
