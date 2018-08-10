package com.xqx.xsblog.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xqx.xsblog.entity.BlogChannel;
import com.xqx.xsblog.entity.example.BlogChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogChannelMapper extends BaseMapper<BlogChannel> {
    long countByExample(BlogChannelExample example);

    int deleteByExample(BlogChannelExample example);

    List<BlogChannel> selectByExample(BlogChannelExample example);

    int updateByExampleSelective(@Param("record") BlogChannel record, @Param("example") BlogChannelExample example);

    int updateByExample(@Param("record") BlogChannel record, @Param("example") BlogChannelExample example);
}