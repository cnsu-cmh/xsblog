package com.xqx.comadmin.service;

import com.baomidou.mybatisplus.service.IService;
import com.xqx.comadmin.entity.User;

import java.util.Map;

public interface UserService extends IService<User> {

    User findUserByLoginName(String name);

    Map selectUserMenuCount();

    User findUserById(String id);
}
