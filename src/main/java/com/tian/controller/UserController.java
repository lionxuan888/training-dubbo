package com.tian.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tian.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by logan on 2020/3/11.
 */
@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        String s = userService.helloDubbo();
        return s;
    }

}
