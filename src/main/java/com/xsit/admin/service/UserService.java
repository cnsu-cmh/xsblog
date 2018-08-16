package com.xsit.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xsit.admin.entity.User;


public interface UserService extends IService<User> {

    User findUserByLoginName(String name);

    User findUserById(String id);
}
