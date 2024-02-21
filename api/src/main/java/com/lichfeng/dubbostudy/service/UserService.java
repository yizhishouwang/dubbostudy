package com.lichfeng.dubbostudy.service;

/**
 * @author lichfeng
 * @description: some desc
 * @email: 1770555310@qq.com
 * @date 2024/2/20 15:14
 */
public interface UserService {
    public boolean login(String name,String password);
    public String getUserName(String name);
}

