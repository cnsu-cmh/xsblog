package com.xqx.comadmin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xqx.comadmin.mapper.UserMapper;
import com.xqx.comadmin.entity.User;
import com.xqx.comadmin.service.UserService;
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

}
