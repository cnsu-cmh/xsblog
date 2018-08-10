package com.xqx.comadmin.service;

import com.baomidou.mybatisplus.service.IService;
import com.xqx.comadmin.entity.User;

public interface UserService extends IService<User> {

    User findUserByLoginName(String name);
}
