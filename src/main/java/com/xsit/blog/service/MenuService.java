package com.xsit.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xsit.blog.entity.Menu;
import com.xsit.blog.entity.vo.ShowMenuVo;

import java.util.List;
import java.util.Map;

public interface MenuService extends IService<Menu> {

    List<ShowMenuVo> getShowMenuByUser(String userId);

    List<Menu> selectAllMenus(Map<String,Object> map);
}