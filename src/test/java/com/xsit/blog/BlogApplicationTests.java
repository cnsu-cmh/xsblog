package com.xsit.blog;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xsit.blog.entity.Menu;
import com.xsit.blog.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

    @Autowired
    MenuService menuService;

    @Test
    public void contextLoads() {
        QueryWrapper<Menu> wrapper = new QueryWrapper<>();
        Object o = menuService.getObj(wrapper.select("max(sort) as sort").isNull("parent_id"));
        System.out.println(o.toString());

    }

}
