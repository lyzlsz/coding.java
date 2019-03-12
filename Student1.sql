--创建一张学生表
create table student(
id int unsigned primary key auto_increment,
sn int not null unique comment'学号',
name varchar(20) not null,
qq varchar(20));

--插入数据,单行数据+全列插入,数据要一一对应
insert into student values (100,10000,'唐三藏',null);
insert into student values (101,10001,'孙悟空','111');

--插入数据.多行数据+指定列插入
insert into sutdent (id,sn,name) values(102,10002,'曹门德'),(103,10003,'孙仲谋');

--主键冲突,由于主键对应的值已经存在而导致的插入失败
insert into student (id,sn,name) values(103,10004,'唐大师');

--唯一键冲突,由于唯一键对应的值已经存在而导致的插入失败
insert into student (id ,sn,name) values(104,10001,'曹爱曼');

--替换
--主键或者唯一键,没有冲突,则直接插入
--主键或者唯一键,有冲突,则删除后插入
replace into student (sn,name) values(10001,'余曼妮');

--创建表结构
create table exam_result(
id int unsigned primary key auto_insrement,
name varchar(20) not null comment'同学姓名',
yuwen float default 0.0 comment'语文成绩',
shuxue float default 0.0 comment'数学成绩',
yingyu float default 0.0 comment'英语成绩');

--插入测试数据
insert into exam_result (name,yuwen,shuxue,yingyu)values
('唐三藏',88,79,90),
('曹爱曼',70,89,67),
('余曼妮',60,88,50),
('孙仲谋',90,89,99),
('曹孟德',90,89,90),
('猪无能',90,89,70);

--全列查询
select * from eaxm_result;

--指定列查询
select id ,name,yingyu from exam_result;

--查询字段为表达式
select id,name,10 from eaxm_result;

--为查询结果指定别名
select id,name,yuwen+shuxue+yingyu 总分 from exam_result;

--结果去重
select shuxue from eaxm_result;
