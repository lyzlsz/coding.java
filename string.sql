--字符串函数
--创建表
create table emp(
eid int primary key auto_increment,
ename varchar(20) not null);

--获取emp表的ename列的字符集
select charset(ename)from emp;

--要求显示student表中的信息.显示格式:'XXX的语文分数是XXX分,数学XXX分,英语XXX分'
select concat(name,'的语文是',chinese,'分,数学是',math,'分')as '分数' from student;

--求学生表中学生姓名所占的字节数
select length(name),name from student ;

--将emp表中所有名字中有'S'的替换成'上海'
select replace(ename,'S','上海'),ename from emp;

--截取emp表中ename字段的第二个到第三个字符
select substring(ename,2,2)ename from emp;

--以首字母小写的方式显示所有员工的姓名
select concat (lcase(substring(ename,1,1)),substring(ename,2)) from emp; 