package com.xqx.xsblog.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("blog_tags")
public class BlogTags extends DataEntity<BlogTags> {

    private static final long serialVersionUID = 1L;

    /**
     * 标签名字
     */
    private String name;
    /**
     * 排序
     */
    private Integer sort;

    @TableField(exist = false)
    private Integer tagsUseCount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getTagsUseCount() {
        return tagsUseCount;
    }

    public void setTagsUseCount(Integer tagsUseCount) {
        this.tagsUseCount = tagsUseCount;
    }

}
