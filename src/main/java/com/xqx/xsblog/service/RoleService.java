package com.xqx.xsblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xqx.xsblog.entity.Role;

public interface RoleService extends IService<Role> {

    long getRoleNameCount(String name);

    Role saveRole(Role role);

    Role getRoleById(String id);

    void updateRole(Role role);

    void deleteRole(Role role);
}
