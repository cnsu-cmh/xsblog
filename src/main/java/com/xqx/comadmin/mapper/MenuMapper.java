package com.xqx.comadmin.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xqx.comadmin.entity.Menu;
import com.xqx.comadmin.entity.example.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper extends BaseMapper<Menu> {

    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    List<Menu> selectByExample(MenuExample example);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);
}