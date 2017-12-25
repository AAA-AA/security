package com.github.security.web.controller;

import com.github.security.dao.entity.SecUser;
import com.github.security.dao.mapper.gen.SecUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA ^_^
 *
 * @author : hongqiangren.
 * @date: 2017/12/25 11:46
 * @email: renhongqiang1397@gmail.com
 */
@Controller
@RequestMapping(value = "/security")
public class SecurityController {

    @Autowired
    private SecUserMapper secUserMapper;

    @RequestMapping("/getUserById")
    @ResponseBody
    public SecUser getUser(Integer id) {
        return secUserMapper.selectByPrimaryKey(id);
    }


}
