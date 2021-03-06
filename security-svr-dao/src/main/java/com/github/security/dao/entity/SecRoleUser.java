package com.github.security.dao.entity;

import java.util.Date;
import lombok.Data;

/**
 * link table is sec_role_user
 * Copyright © 2017, github and/or its affiliates. All rights reserved.
 **/
@Data
public class SecRoleUser {
    private Integer id;

    /**用户id*/
    private Integer userId;

    /**角色id*/
    private Integer roleId;

    /**版本号*/
    private Integer version;

    /**记录同步时间*/
    private Date createdAt;

    /**创建人*/
    private String createdBy;

    /**删除状态字段，0有效，1删除*/
    private Integer isDelete;

    /**状态,目前仅作保留字段*/
    private Integer status;

    /**记录更新时间*/
    private Date updatedAt;

    /**更新人*/
    private String updatedBy;
}