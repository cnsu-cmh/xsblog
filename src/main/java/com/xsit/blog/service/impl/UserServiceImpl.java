package com.xsit.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xsit.blog.mapper.UserMapper;
import com.xsit.blog.entity.User;
import com.xsit.blog.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User findUserByLoginName(String name) {
        Map<String,Object> map = new HashMap();
        map.put("loginName", name);
        User u = baseMapper.selectUserByMap(map);
        return u;
    }

    @Override
    public User findUserById(String id) {
//        Map<String,Object> map = new HashMap();
//        map.put("id", id);
        return baseMapper.selectById(id);
    }

}
