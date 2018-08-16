package com.xsit.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xsit.blog.entity.User;

public interface UserService extends IService<User> {

    User findUserByLoginName(String name);

    User findUserById(String id);
}
