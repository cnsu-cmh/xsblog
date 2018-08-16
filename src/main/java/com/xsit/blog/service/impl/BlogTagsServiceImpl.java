package com.xsit.blog.service.impl;

import com.xsit.blog.entity.BlogTags;
import com.xsit.blog.mapper.BlogTagsMapper;
import com.xsit.blog.service.BlogTagsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客标签,1 服务实现类
 * </p>
 *
 * @author cusn-cmh
 * @since 2018-08-16
 */
@Service
public class BlogTagsServiceImpl extends ServiceImpl<BlogTagsMapper, BlogTags> implements BlogTagsService {

}
