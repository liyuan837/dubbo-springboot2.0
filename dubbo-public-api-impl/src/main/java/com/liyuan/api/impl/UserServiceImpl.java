package com.liyuan.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liyuan.api.domain.User;
import com.liyuan.api.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author liyuan
 * @Date 2018/11/18 16:08
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User queryUser() {
        User user = new User();
        user.setId(1);
        user.setName("liyuan");
        return user;
    }
}
