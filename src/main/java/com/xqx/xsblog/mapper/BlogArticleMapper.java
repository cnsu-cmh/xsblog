package com.xqx.xsblog.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xqx.xsblog.entity.BlogArticle;
import com.xqx.xsblog.entity.example.BlogArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogArticleMapper extends BaseMapper<BlogArticle> {
    long countByExample(BlogArticleExample example);

    int deleteByExample(BlogArticleExample example);

    List<BlogArticle> selectByExampleWithBLOBs(BlogArticleExample example);

    List<BlogArticle> selectByExample(BlogArticleExample example);

    int updateByExampleSelective(@Param("record") BlogArticle record, @Param("example") BlogArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogArticle record, @Param("example") BlogArticleExample example);

    int updateByExample(@Param("record") BlogArticle record, @Param("example") BlogArticleExample example);
}