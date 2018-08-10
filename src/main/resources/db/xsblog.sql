/*
Navicat MySQL Data Transfer

Source Server         : mySql
Source Server Version : 50137
Source Host           : localhost:3306
Source Database       : xsblog

Target Server Type    : MYSQL
Target Server Version : 50137
File Encoding         : 65001

Date: 2018-08-10 19:15:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog_article
-- ----------------------------
DROP TABLE IF EXISTS `blog_article`;
CREATE TABLE `blog_article` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `title` varchar(255) NOT NULL COMMENT '标题,input,NO,false,true,true',
  `sub_title` varchar(255) DEFAULT NULL COMMENT '副标题,input,YES,false,false,false',
  `marks` varchar(255) DEFAULT NULL COMMENT '摘要,textarea,YES,false,false,false',
  `show_pic` varchar(255) DEFAULT NULL COMMENT '显示图片,uploadImg,YES,false,false,false',
  `category` varchar(255) DEFAULT NULL COMMENT '文章类型,radio,YES,false,true,true',
  `out_link_url` varchar(255) DEFAULT NULL COMMENT '外链地址,input,YES,false,false,false',
  `resources` varchar(255) DEFAULT NULL COMMENT '来源,input,YES,false,true,false',
  `publist_time` datetime DEFAULT NULL COMMENT '发布时间,timer,YES,false,true,true',
  `content` text NOT NULL COMMENT '内容,editor,NO,false,true,true',
  `text` text COMMENT '纯文字文章内容,textarea,YES,false,false,false',
  `click` int(11) DEFAULT NULL COMMENT '浏览量,0,YES,false,false,false',
  `channel_id` varchar(36) DEFAULT NULL COMMENT '栏目ID,0,YES,false,false,false',
  `sort` int(11) DEFAULT NULL COMMENT '排序值,0,YES,false,false,false',
  `is_top` bit(1) DEFAULT NULL COMMENT '是否置顶,switch,YES,true,true,false',
  `is_recommend` bit(1) DEFAULT NULL COMMENT '是否推荐,switch,YES,true,true,false',
  `status` int(11) DEFAULT NULL COMMENT '文章状态,0,YES,false,false,false',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(36) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `update_by` varchar(36) DEFAULT NULL COMMENT '修改人',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `del_flag` tinyint(4) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='博客内容,1,uploadImg-showPic-YES,timer-publistTime-YES,editor-co';

-- ----------------------------
-- Records of blog_article
-- ----------------------------

-- ----------------------------
-- Table structure for blog_article_tags
-- ----------------------------
DROP TABLE IF EXISTS `blog_article_tags`;
CREATE TABLE `blog_article_tags` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `article_id` varchar(36) NOT NULL COMMENT '文章ID,0,NO,false,false,false',
  `tags_id` varchar(36) NOT NULL COMMENT '标签ID,0,NO,false,false,false',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标签-文章关联表,3';

-- ----------------------------
-- Records of blog_article_tags
-- ----------------------------

-- ----------------------------
-- Table structure for blog_channel
-- ----------------------------
DROP TABLE IF EXISTS `blog_channel`;
CREATE TABLE `blog_channel` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `name` varchar(255) NOT NULL COMMENT '名称,input,NO,false,true,true',
  `site_id` varchar(36) DEFAULT NULL COMMENT '站点ID,0,YES,false,false,false',
  `href` varchar(500) DEFAULT NULL COMMENT '链接地址,input,YES,false,true,true',
  `logo` varchar(255) DEFAULT NULL COMMENT '栏目图标,input,YES,false,true,false',
  `is_base_channel` bit(1) DEFAULT NULL COMMENT '是否为主栏目,switch,YES,true,true,true',
  `can_comment` bit(1) DEFAULT NULL COMMENT '是否能够评论,switch,YES,true,true,true',
  `is_no_name` bit(1) DEFAULT NULL COMMENT '是否匿名,switch,YES,true,true,true',
  `is_can_aduit` bit(1) DEFAULT NULL COMMENT '是否开启审核,switch,YES,true,true,true',
  `seo_title` varchar(255) DEFAULT NULL COMMENT '网页title(seo),input,YES,false,false,false',
  `seo_keywords` varchar(255) DEFAULT NULL COMMENT '网页关键字(seo) ,input,YES,false,false,false',
  `seo_description` varchar(255) DEFAULT NULL COMMENT '网页描述(seo),textarea,YES,false,false,false',
  `parent_id` varchar(36) DEFAULT NULL COMMENT '父节点ID',
  `parent_ids` varchar(2000) DEFAULT NULL COMMENT '父节点联集',
  `level` bigint(2) DEFAULT NULL COMMENT '层级深度',
  `sort` smallint(6) DEFAULT NULL COMMENT '排序',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(20) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `update_by` varchar(20) DEFAULT NULL COMMENT '修改人',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `del_flag` tinyint(4) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='博客栏目,2,switch-baseChannel-YES-true-is_base_channel,switch-ca';

-- ----------------------------
-- Records of blog_channel
-- ----------------------------

-- ----------------------------
-- Table structure for blog_tags
-- ----------------------------
DROP TABLE IF EXISTS `blog_tags`;
CREATE TABLE `blog_tags` (
  `id` varchar(20) NOT NULL COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '标签名字,input,YES,false,true,true',
  `sort` int(11) DEFAULT NULL COMMENT '排序,0,YES,false,false,false',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(20) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `update_by` varchar(20) DEFAULT NULL COMMENT '修改人',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `del_flag` tinyint(4) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='博客标签,1';

-- ----------------------------
-- Records of blog_tags
-- ----------------------------
