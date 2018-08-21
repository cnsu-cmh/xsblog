package com.xsit.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xsit.blog.entity.Role;
import com.xsit.blog.entity.User;

import java.util.Set;

public interface UserService extends IService<User> {

    User findUserByLoginName(String name);

    User findUserById(String id);

    int userCount(String loginName);

    void saveUserRoles(String id, Set<Role> roleLists);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
