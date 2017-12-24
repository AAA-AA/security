package com.github.security.dao.entity;

import java.util.Date;
import lombok.Data;

/**
 * link table is sec_resources
 * Copyright © 2017, github and/or its affiliates. All rights reserved.
 **/
@Data
public class SecResources {
    private Integer id;

    private Date ctime;

    private Date mtime;

    private Integer version;

    private Integer status;

    private String mark;

    /**菜单名字*/
    private String name;

    private Integer operator;

    /**唯一key*/
    private String resourceKey;

    /**类型，0：一级菜单；1：二级菜单；2：三级菜单*/
    private Integer type;

    /**请求路径*/
    private String uri;

    /**父节点id*/
    private Integer parentId;

    private String level;
}