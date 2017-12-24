package com.github.security.dao.entity;

import java.util.Date;
import lombok.Data;

/**
 * link table is sec_users
 * Copyright © 2017, github and/or its affiliates. All rights reserved.
 **/
@Data
public class SecUsers {
    private Integer id;

    private Date ctime;

    private Date mtime;

    private Integer version;

    private Integer status;

    private String mark;

    /**登录用户名，与dashboard名字一致*/
    private String name;

    /**最后登录时间，精确到秒*/
    private Date lastLoginDate;

    private Integer operator;
}