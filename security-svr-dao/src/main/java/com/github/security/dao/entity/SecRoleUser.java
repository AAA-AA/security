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

    private Date createTime;

    private Date updateTime;

    private Integer version;

    private Integer status;

    private String mark;

    /**用户id*/
    private Integer userId;

    /**角色id*/
    private Integer roleId;
}