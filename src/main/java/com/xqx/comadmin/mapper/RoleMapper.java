package com.xqx.comadmin.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xqx.comadmin.entity.Role;
import com.xqx.comadmin.entity.example.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper extends BaseMapper<Role> {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    List<Role> selectByExample(RoleExample example);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);
}