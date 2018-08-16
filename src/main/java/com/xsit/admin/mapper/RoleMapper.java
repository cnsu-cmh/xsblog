package com.xsit.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xsit.admin.entity.Menu;
import com.xsit.admin.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface RoleMapper extends BaseMapper<Role> {

    void saveRoleMenus(@Param("roleId") String roleId,  @Param("menus") Set<Menu> menuSet);

    Role selectRoleById(@Param("roleId") String roleId);

    void dropRoleMenus(@Param("roleId") String roleId);

    void dropRoleUsers(@Param("roleId") String roleId);
}