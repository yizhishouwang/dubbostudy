package com.lichfeng.dubbostudy.service.impl;

import com.lichfeng.dubbostudy.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author lichfeng
 * @description: some desc
 * @email: 1770555310@qq.com
 * @date 2024/2/20 16:35
 */
// 注册组件：使用Dubbo尽量不是使用@Service
@Component
// Dubbo注册：项目启动时，自动注册到注册中心
@DubboService
// 实现公共接口UserService，通过公共模块依赖引入
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String name, String password) {
        return false;
    }

    @Override
    public String getUserName(String name) {
        return "hello 1111" + name;
    }
}

