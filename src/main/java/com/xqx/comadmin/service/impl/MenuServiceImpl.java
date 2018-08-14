package com.xqx.comadmin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xqx.comadmin.entity.Menu;
import com.xqx.comadmin.entity.vo.ShowMenuVo;
import com.xqx.comadmin.mapper.MenuMapper;
import com.xqx.comadmin.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class MenuServiceImpl extends ServiceImpl<MenuMapper,Menu> implements MenuService {

    @Override
    public List<ShowMenuVo> getShowMenuByUser(String id) {
        Map<String,Object> map = new HashMap();
        map.put("userId",id);
        map.put("parentId",null);
        return baseMapper.selectShowMenuByUser(map);
    }
}
