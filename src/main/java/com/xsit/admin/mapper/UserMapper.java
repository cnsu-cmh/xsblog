package com.xsit.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xsit.admin.entity.User;

import java.util.Map;


public interface UserMapper extends BaseMapper<User> {

    User selectUserByMap(Map<String,Object> map);
}