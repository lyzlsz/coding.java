drop database if exists `memo`;
create database if not exists `memo` default character set utf8 collate
utf8_general_ci;
use `memo`;
drop table if exists `memo_group`;
create table if not exists `memo_group`(
id int primary key auto_increment comment '便签组编号',
name varchar(8) not null unique key comment '便签组名称',
 created_time datetime not null comment '创建时间',
 modify_time timestamp comment '修改时间'
)engine innodb;
-- 默认分组
insert into `memo_group` (id,name,created_time) values (1, '默认组', now());
drop table if exists `memo_info`;
create table if not exists `memo_info`(
id int primary key auto_increment comment '便签编号',
group_id int not null comment '便签组编号',
title varchar(32) not null comment '便签标题',
content varchar(1024) not null default '' comment '便签内容',
is_protected char(1) not null default '0' comment '是否私密，0：公开 1：私密',
background enum('WHITE','RED','BLUE','GREEN') default 'WHITE' comment '背景颜色',
is_remind  char(1) default '0' comment '是否提醒，0：不提醒 1：提醒',
remind_time datetime comment '提醒时间',
created_time datetime not null comment '创建时间',
modify_time timestamp comment '修改时间'
)engine innodb;
-- 欢迎标签
insert into `memo_info`(id,group_id,title,content,created_time) values (1,1,'欢迎使
用','下面是使用手册',now());
drop table if exists `memo_share`;
create table if not exists `memo_share`(
id int primary key auto_increment comment '便签分享编号',
info_id int comment '便签编号',
mark varchar(32) not null default '' comment '分享备注',
share_time  datetime not null comment '分享时间'
)engine innodb;
-- 欢迎标签分享
insert into `memo_share`(id,info_id,mark, share_time) values (1,1,'特别有意思的便签
APP',now());