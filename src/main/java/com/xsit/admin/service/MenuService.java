package com.xsit.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xsit.admin.entity.Menu;
import com.xsit.admin.entity.vo.ShowMenuVo;

import java.util.List;
import java.util.Map;

public interface MenuService extends IService<Menu> {

    List<ShowMenuVo> getShowMenuByUser(String userId);

    List<Menu> selectAllMenus(Map<String,Object> map);
}
