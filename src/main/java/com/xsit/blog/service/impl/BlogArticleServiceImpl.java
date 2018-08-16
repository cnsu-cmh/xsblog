package com.xsit.blog.service.impl;

import com.xsit.blog.entity.BlogArticle;
import com.xsit.blog.mapper.BlogArticleMapper;
import com.xsit.blog.service.BlogArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 博客内容,1,uploadImg-showPic-YES,timer-publistTime-YES,editor-co 服务实现类
 * </p>
 *
 * @author cusn-cmh
 * @since 2018-08-16
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class BlogArticleServiceImpl extends ServiceImpl<BlogArticleMapper, BlogArticle> implements BlogArticleService {

}
