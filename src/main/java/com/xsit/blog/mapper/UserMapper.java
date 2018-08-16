package com.xsit.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xsit.blog.entity.User;
import java.util.Map;


public interface UserMapper extends BaseMapper<User> {

    User selectUserByMap(Map<String,Object> map);
}