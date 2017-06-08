--第五章-----------------------------------------------------
--1. 列出所有雇员的姓名及其直接上级的姓名
select e.ename,m.ename from emp e left join emp m on e.mgr=m.empno;
--2. 列出部门名称和这些部门的雇员,同时列出那些没有雇员的部门
select dname,ename from dept d left join emp e on d.deptno=e.deptno;
--3. 显示所有部门在"NEW YORK"(dept表 loc字段)的员工姓名
select e.ename from emp e,dept d where e.deptno=d.deptno and d.loc=’NEW YORK’;
--4. 显示员工"SMITH"的姓名，部门名称
select e.ename,d.dname from emp e,dept d where e.deptno=d.deptno and e.ename='SMITH';
--5. 显示员工姓名，部门名称，工资，工资级别(salgrade表 grade字段),要求工资级别大于 4级
select e.ename,d.dname,e.sal,s.grade from emp e,dept d,salgrade s where e.deptno=d.deptno and e.sal between s.losal and s.hisal and s.grade >4;
--6. 显示员工"KING"和"FORD"管理的员工姓名及其经理姓名
select e1.ename,e2.ename from emp e1,emp e2 where e1.mgr=e2.empno and (e2.ename='KING'or e2.ename='FORD');
--7. 显示员工名，参加工作时间，经理名，参加工作时间：参加工作时间比他的经理早
select e1.ename,e1.hiredate,e2.ename,e2.hiredate from emp e1,emp e2 where e1.mgr=e2.empno and e1.hiredate<e2.hiredate;

