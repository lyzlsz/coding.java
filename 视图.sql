创建视图
案例
修改了视图，对基表数据有影响
修改了基表，对视图有影响
create view 视图名 as select语句；
create view v_ename_dname as select ename, dname
from EMP, DEPT where EMP.deptno=DEPT.deptno;
select * from v_ename_dname;
+--------+------------+
| ename | dname   |
+--------+------------+
| CLARK | ACCOUNTING |
| KING  | ACCOUNTING |
| MILLER | ACCOUNTING |
| SMITH | RESEARCH  |
| JONES | RESEARCH  |
| SCOTT | RESEARCH  |
| ADAMS | RESEARCH  |
| FORD  | RESEARCH  |
| ALLEN | SALES   |
| WARD  | SALES   |
| MARTIN | SALES   |
| BLAKE | SALES   |
| TURNER | SALES   |
| JAMES | SALES   |
+--------+------------+
update v_ename_dname set dname='sales'  where ename='CLARK';
select * from EMP  where e