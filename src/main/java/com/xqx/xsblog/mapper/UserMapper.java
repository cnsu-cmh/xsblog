package com.xqx.xsblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xqx.xsblog.entity.User;
import java.util.Map;


public interface UserMapper extends BaseMapper<User> {

    User selectUserByMap(Map<String,Object> map);
}