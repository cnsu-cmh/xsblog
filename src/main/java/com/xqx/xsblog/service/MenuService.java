package com.xqx.xsblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xqx.xsblog.entity.Menu;
import com.xqx.xsblog.entity.vo.ShowMenuVo;

import java.util.List;
import java.util.Map;

public interface MenuService extends IService<Menu> {

    List<ShowMenuVo> getShowMenuByUser(String userId);

    List<Menu> selectAllMenus(Map<String,Object> map);
}
