package com.xsit.blog.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 博客内容,1,uploadImg-showPic-YES,timer-publistTime-YES,editor-co
 * </p>
 *
 * @author cusn-cmh
 * @since 2018-08-16
 */
@TableName("blog_article")
public class BlogArticle extends Model<BlogArticle> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 标题,input,NO,false,true,true
     */
    private String title;

    /**
     * 副标题,input,YES,false,false,false
     */
    @TableField("sub_title")
    private String subTitle;

    /**
     * 摘要,textarea,YES,false,false,false
     */
    private String marks;

    /**
     * 显示图片,uploadImg,YES,false,false,false
     */
    @TableField("show_pic")
    private String showPic;

    /**
     * 文章类型,radio,YES,false,true,true
     */
    private String category;

    /**
     * 外链地址,input,YES,false,false,false
     */
    @TableField("out_link_url")
    private String outLinkUrl;

    /**
     * 来源,input,YES,false,true,false
     */
    private String resources;

    /**
     * 发布时间,timer,YES,false,true,true
     */
    @TableField("publist_time")
    private LocalDateTime publistTime;

    /**
     * 内容,editor,NO,false,true,true
     */
    private String content;

    /**
     * 纯文字文章内容,textarea,YES,false,false,false
     */
    private String text;

    /**
     * 浏览量,0,YES,false,false,false
     */
    private Integer click;

    /**
     * 栏目ID,0,YES,false,false,false
     */
    @TableField("channel_id")
    private String channelId;

    /**
     * 排序值,0,YES,false,false,false
     */
    private Integer sort;

    /**
     * 是否置顶,switch,YES,true,true,false
     */
    @TableField("is_top")
    private Boolean isTop;

    /**
     * 是否推荐,switch,YES,true,true,false
     */
    @TableField("is_recommend")
    private Boolean isRecommend;

    /**
     * 文章状态,0,YES,false,false,false
     */
    private Integer status;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getShowPic() {
        return showPic;
    }

    public void setShowPic(String showPic) {
        this.showPic = showPic;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOutLinkUrl() {
        return outLinkUrl;
    }

    public void setOutLinkUrl(String outLinkUrl) {
        this.outLinkUrl = outLinkUrl;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public LocalDateTime getPublistTime() {
        return publistTime;
    }

    public void setPublistTime(LocalDateTime publistTime) {
        this.publistTime = publistTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getTop() {
        return isTop;
    }

    public void setTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public Boolean getRecommend() {
        return isRecommend;
    }

    public void setRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public static final String TITLE = "title";

    public static final String SUB_TITLE = "sub_title";

    public static final String MARKS = "marks";

    public static final String SHOW_PIC = "show_pic";

    public static final String CATEGORY = "category";

    public static final String OUT_LINK_URL = "out_link_url";

    public static final String RESOURCES = "resources";

    public static final String PUBLIST_TIME = "publist_time";

    public static final String CONTENT = "content";

    public static final String TEXT = "text";

    public static final String CLICK = "click";

    public static final String CHANNEL_ID = "channel_id";

    public static final String SORT = "sort";

    public static final String IS_TOP = "is_top";

    public static final String IS_RECOMMEND = "is_recommend";

    public static final String STATUS = "status";

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
        return "BlogArticle{" +
        ", id=" + id +
        ", title=" + title +
        ", subTitle=" + subTitle +
        ", marks=" + marks +
        ", showPic=" + showPic +
        ", category=" + category +
        ", outLinkUrl=" + outLinkUrl +
        ", resources=" + resources +
        ", publistTime=" + publistTime +
        ", content=" + content +
        ", text=" + text +
        ", click=" + click +
        ", channelId=" + channelId +
        ", sort=" + sort +
        ", isTop=" + isTop +
        ", isRecommend=" + isRecommend +
        ", status=" + status +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        ", updateDate=" + updateDate +
        ", updateBy=" + updateBy +
        ", remarks=" + remarks +
        ", delFlag=" + delFlag +
        "}";
    }
}
