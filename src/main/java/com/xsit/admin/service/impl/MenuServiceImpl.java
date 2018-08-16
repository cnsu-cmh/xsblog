package com.xsit.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xsit.admin.entity.Menu;
import com.xsit.admin.entity.vo.ShowMenuVo;
import com.xsit.admin.mapper.MenuMapper;
import com.xsit.admin.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class MenuServiceImpl extends ServiceImpl<MenuMapper,Menu> implements MenuService {

    @Override
    public List<ShowMenuVo> getShowMenuByUser(String id) {
        Map<String,Object> map = new HashMap();
        map.put("userId",id);
        map.put("parentId",null);
        return baseMapper.selectShowMenuByUser(map);
    }

    @Override
    public List<Menu> selectAllMenus(Map<String, Object> map) {
        return baseMapper.getMenus(map);
    }
}
