package com.liyuan.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liyuan.api.domain.User;
import com.liyuan.api.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author liyuan
 * @Date 2018/11/18 16:31
 **/
@RestController
public class UserController {
    @Reference
    private UserService userService;

    @ApiOperation(value = "测试接口", notes = "测试接口", httpMethod = "POST")
    @RequestMapping("/query")
    public User queryUser(){
        return userService.queryUser();
    }
}
