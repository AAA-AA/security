package com.github.security.dao.entity;

import java.util.Date;
import lombok.Data;

/**
 * link table is sec_roles
 * Copyright © 2017, github and/or its affiliates. All rights reserved.
 **/
@Data
public class SecRoles {
    private Integer id;

    private Date ctime;

    private Date mtime;

    private Integer version;

    private Integer status;

    private String mark;

    private Integer operator;

    /**角色名*/
    private String name;

    /**角色key*/
    private String roleKey;

    /**描述*/
    private String description;
}