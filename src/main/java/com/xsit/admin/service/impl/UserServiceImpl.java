package com.xsit.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xsit.admin.mapper.UserMapper;
import com.xsit.admin.entity.User;
import com.xsit.admin.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service("userService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
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
        Map<String,Object> map = new HashMap();
        map.put("id", id);
        return baseMapper.selectUserByMap(map);
    }

}
