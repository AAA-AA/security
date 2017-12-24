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

    private Date createTime;

    private Date updateTime;

    private Integer version;

    private Integer status;

    private String mark;

    /**菜单id*/
    private Integer resourceId;

    /**角色id*/
    private Integer roleId;
}