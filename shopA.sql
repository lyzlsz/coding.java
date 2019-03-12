* 商品goods(商品编号goods_id，商品名goods_name, 单价unitprice, 商品类别category, 供应商provider)
* 客户customer(客户号customer_id,姓名name,住址address,邮箱email,性别sex，身份证card_id)
* 购买purchase(购买订单号order_id,客户号customer_ id,商品号goods_ id,购买数量nums)


要求：
每个表的主外键
客户的姓名不能为空值
邮箱不能重复
客户的性别(男，女)


-- 创建数据库
create database if not exists bit32mall
default character set utf8 ;

-- 选择数据库
use bit32mall;


-- 创建数据库表
-- 商品
create table if not exists goods
(
 goods_id  int primary key auto_increment comment '商品编号',
 goods_name varchar(32) not null comment '商品名称',
 unitprice  int  not null default 0 comment '单价，单位分',
 category  varchar(12) comment '商品分类',
 provider  varchar(64) not null comment '供应商名称'
);

-- 客户
create table if not exists customer
(
 customer_id  int primary key auto_increment comment '客户编号',
 name varchar(32) not null comment '客户姓名',
 address  varchar(256) comment '客户地址',
 email  varchar(64) unique key comment '电子邮箱',
 sex  enum('男','女') not null comment '性别',
 card_id char(18) unique key comment '身份证'
);

-- 购买
create table if not exists purchase
(
 order_id  int primary key auto_increment comment '订单号',
 customer_id int comment '客户编号',
 goods_id  int comment '商品编号',
 nums  int default 0 comment '购买数量',
 foreign key (customer_id) references customer(customer_id),
 foreign key (goods_id) references goods(goods_id)
);