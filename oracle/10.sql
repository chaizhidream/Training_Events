--第十章
--1.创建序列，起始位1，自增为1，最小值为1，最大值为9999
create sequence SEQ_dual
minvalue 1
maxvalue 9999
start with 1
increment by 1
cache 20;
--2.请为工资大于10000的员工创建视图，要求显示员工的部门信息，职位信息，部门所在地.
CREATE VIEW vw_emp AS
SELECT (
SELECT d.dname FROM dept d WHERE d.deptno=e.deptno
) dname,job,(
SELECT loc FROM dept d WHERE d.deptno=e.deptno
) loc FROM emp e WHERE sal>1000;
--3.请为工资创建索引，比较<10000,>1000,与round（sal）>10000,哪个索引有效，哪个索引无效。
CREATE INDEX idx_sal ON emp(sal);  
--前两个有效，最后一个无效
--4.现在按照工资的降序排序，分页显示，其中一页数据为25条，请显示第3页数据。
 select * from (select rownum as r,t.* from   
                            (select emp.* from emp order by sal desc) t where rownum<=75)  
                                      where r>50;  
--5.创建视图，要求包含字段：部门名，部门平均工资
create VIEW vw_dept AS
SELECT dname,(SELECT AVG(sal) FROM emp GROUP BY deptno) avgsal FROM dept;
--6.针对以上视图执行insert,update,delete,语句能否成功，为什么？
--可以，没有写只读
--7.显示出员工工资排在第五到第十名的员工信息
SELECT * FROM (SELECT s.*,ROWNUM rn FROM (SELECT * FROM emp e ORDER BY sal DESC) s) WHERE rn BETWEEN 5 AND 10;
--8.创建序列，起始值为50，每次增加5
create sequence SEQ_dual
minvalue 1
maxvalue 9999
start with 50
increment by 5
cache 20;
--9.在表copy_dept中插入记录，其中部门号码采用上一步中创建的序列生成
INSERT INTO copy_dept VALUES(SEQ_dual.Nextval,'da','NewYork');
--10.创建表，采用"create table copy_emp_index as select * from emp"，生成500万条数据，把其中的"员工号"字段修改为唯一
create table copy_emp_index as select * from emp;
ALTER TABLE copy_emp_index CONSTRAINT uq_empno UNIQUE(EMPNO)
-11.查询表copy_emp_index表中员工号为200001的员工姓名，工资，记录执行时间
SELECT ename,sal FROM copy_emp_index WHERE empno=200001;
--12.在copy_emp_index表的empno字段上创建索引，再次执行第１１步语句，记录执行时间并做对比
--略
