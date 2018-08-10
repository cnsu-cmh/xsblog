package com.xqx.xsblog.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xqx.xsblog.entity.BlogTags;
import com.xqx.xsblog.entity.example.BlogTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTagsMapper extends BaseMapper<BlogTags> {
    long countByExample(BlogTagsExample example);

    int deleteByExample(BlogTagsExample example);

    List<BlogTags> selectByExample(BlogTagsExample example);

    int updateByExampleSelective(@Param("record") BlogTags record, @Param("example") BlogTagsExample example);

    int updateByExample(@Param("record") BlogTags record, @Param("example") BlogTagsExample example);
}