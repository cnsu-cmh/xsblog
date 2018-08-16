package com.xsit.blog.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 博客栏目,2,switch-baseChannel-YES-true-is_base_channel,switch-ca
 * </p>
 *
 * @author cusn-cmh
 * @since 2018-08-16
 */
@TableName("blog_channel")
public class BlogChannel extends Model<BlogChannel> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 名称,input,NO,false,true,true
     */
    private String name;

    /**
     * 站点ID,0,YES,false,false,false
     */
    @TableField("site_id")
    private String siteId;

    /**
     * 链接地址,input,YES,false,true,true
     */
    private String href;

    /**
     * 栏目图标,input,YES,false,true,false
     */
    private String logo;

    /**
     * 是否为主栏目,switch,YES,true,true,true
     */
    @TableField("is_base_channel")
    private Boolean isBaseChannel;

    /**
     * 是否能够评论,switch,YES,true,true,true
     */
    @TableField("can_comment")
    private Boolean canComment;

    /**
     * 是否匿名,switch,YES,true,true,true
     */
    @TableField("is_no_name")
    private Boolean isNoName;

    /**
     * 是否开启审核,switch,YES,true,true,true
     */
    @TableField("is_can_aduit")
    private Boolean isCanAduit;

    /**
     * 网页title(seo),input,YES,false,false,false
     */
    @TableField("seo_title")
    private String seoTitle;

    /**
     * 网页关键字(seo) ,input,YES,false,false,false
     */
    @TableField("seo_keywords")
    private String seoKeywords;

    /**
     * 网页描述(seo),textarea,YES,false,false,false
     */
    @TableField("seo_description")
    private String seoDescription;

    /**
     * 父节点ID
     */
    @TableField("parent_id")
    private String parentId;

    /**
     * 父节点联集
     */
    @TableField("parent_ids")
    private String parentIds;

    /**
     * 层级深度
     */
    private Long level;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    @TableField("create_date")
    private LocalDateTime createDate;

    /**
     * 创建人
     */
    @TableField("create_by")
    private String createBy;

    /**
     * 修改时间
     */
    @TableField("update_date")
    private LocalDateTime updateDate;

    /**
     * 修改人
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 删除标记
     */
    @TableField("del_flag")
    private Integer delFlag;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getBaseChannel() {
        return isBaseChannel;
    }

    public void setBaseChannel(Boolean isBaseChannel) {
        this.isBaseChannel = isBaseChannel;
    }

    public Boolean getCanComment() {
        return canComment;
    }

    public void setCanComment(Boolean canComment) {
        this.canComment = canComment;
    }

    public Boolean getNoName() {
        return isNoName;
    }

    public void setNoName(Boolean isNoName) {
        this.isNoName = isNoName;
    }

    public Boolean getCanAduit() {
        return isCanAduit;
    }

    public void setCanAduit(Boolean isCanAduit) {
        this.isCanAduit = isCanAduit;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String SITE_ID = "site_id";

    public static final String HREF = "href";

    public static final String LOGO = "logo";

    public static final String IS_BASE_CHANNEL = "is_base_channel";

    public static final String CAN_COMMENT = "can_comment";

    public static final String IS_NO_NAME = "is_no_name";

    public static final String IS_CAN_ADUIT = "is_can_aduit";

    public static final String SEO_TITLE = "seo_title";

    public static final String SEO_KEYWORDS = "seo_keywords";

    public static final String SEO_DESCRIPTION = "seo_description";

    public static final String PARENT_ID = "parent_id";

    public static final String PARENT_IDS = "parent_ids";

    public static final String LEVEL = "level";

    public static final String SORT = "sort";

    public static final String CREATE_DATE = "create_date";

    public static final String CREATE_BY = "create_by";

    public static final String UPDATE_DATE = "update_date";

    public static final String UPDATE_BY = "update_by";

    public static final String REMARKS = "remarks";

    public static final String DEL_FLAG = "del_flag";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BlogChannel{" +
        ", id=" + id +
        ", name=" + name +
        ", siteId=" + siteId +
        ", href=" + href +
        ", logo=" + logo +
        ", isBaseChannel=" + isBaseChannel +
        ", canComment=" + canComment +
        ", isNoName=" + isNoName +
        ", isCanAduit=" + isCanAduit +
        ", seoTitle=" + seoTitle +
        ", seoKeywords=" + seoKeywords +
        ", seoDescription=" + seoDescription +
        ", parentId=" + parentId +
        ", parentIds=" + parentIds +
        ", level=" + level +
        ", sort=" + sort +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        ", updateDate=" + updateDate +
        ", updateBy=" + updateBy +
        ", remarks=" + remarks +
        ", delFlag=" + delFlag +
        "}";
    }
}
