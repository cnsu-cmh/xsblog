package com.xqx.comadmin.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xqx.comadmin.entity.User;
import com.xqx.comadmin.entity.example.UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);


    User selectUserByMap(Map<String,Object> map);
}