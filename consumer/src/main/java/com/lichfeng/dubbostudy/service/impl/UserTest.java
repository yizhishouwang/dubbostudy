package com.lichfeng.dubbostudy.service.impl;

import com.lichfeng.dubbostudy.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author lichfeng
 * @description: some desc
 * @email: 1770555310@qq.com
 * @date 2024/2/21 15:31
 */

@Service
public class UserTest {
    @DubboReference
    private UserService  userService;

    public void doUserTest(){
        userService.getUserName("cccvvv1001");
    }
}
