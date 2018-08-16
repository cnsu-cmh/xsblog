package com.xqx.xsblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xqx.xsblog.entity.User;

public interface UserService extends IService<User> {

    User findUserByLoginName(String name);

    User findUserById(String id);
}
