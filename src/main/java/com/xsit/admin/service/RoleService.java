package com.xsit.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xsit.admin.entity.Role;

public interface RoleService extends IService<Role> {

    long getRoleNameCount(String name);

    Role saveRole(Role role);

    Role getRoleById(String id);

    void updateRole(Role role);

    void deleteRole(Role role);
}
