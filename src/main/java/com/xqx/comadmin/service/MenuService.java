package com.xqx.comadmin.service;

import com.baomidou.mybatisplus.service.IService;
import com.xqx.comadmin.entity.Menu;
import com.xqx.comadmin.entity.vo.ShowMenuVo;

import java.util.List;

public interface MenuService extends IService<Menu> {

    List<ShowMenuVo> getShowMenuByUser(String userId);
}
