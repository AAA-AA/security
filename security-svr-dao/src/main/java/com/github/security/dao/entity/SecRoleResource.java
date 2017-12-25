package com.github.security.dao.entity;

import java.util.Date;
import lombok.Data;

/**
 * link table is sec_role_resource
 * Copyright © 2017, github and/or its affiliates. All rights reserved.
 **/
@Data
public class SecRoleResource {
    private Integer id;

    /**资源id*/
    private Integer resourceId;

    /**角色id*/
    private Integer roleId;

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