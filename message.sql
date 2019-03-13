--日期函数

--创建一个留言表
create table msg(
id int primary key auto_increment,
content varchar(30) not null,
sendtime datetime);

--插入数据
insert into msg(content,sendtime) values ('hello1',now());
insert into msg(content,sendtime) values ('hello2',now());

--查询数据
select * from msg;

--显示所有留言信息,发布日期只显示日期,不用显示时间
select content,date(sendtime) from msg;

--请查询两分钟内发布的帖子
select * from msg where date_add(sendtime,interval 2 minute)>now();