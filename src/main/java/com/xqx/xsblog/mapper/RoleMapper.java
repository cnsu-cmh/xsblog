package com.xqx.xsblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xqx.xsblog.entity.Menu;
import com.xqx.xsblog.entity.Role;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface RoleMapper extends BaseMapper<Role> {

    void saveRoleMenus(@Param("roleId") String roleId,  @Param("menus") Set<Menu> menuSet);

    Role selectRoleById(@Param("roleId") String roleId);

    void dropRoleMenus(@Param("roleId") String roleId);

    void dropRoleUsers(@Param("roleId") String roleId);
}