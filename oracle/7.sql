﻿--第七章------------------------------------------
--1. 列出至少有一个雇员的所有部门
select distinct dname from dept where deptno in (select deptno from emp);
--2. 列出薪金比"SMITH"多的所有雇员
select ename from emp where sal>(select sal from emp where ename='SMITH');
--3. 列出入职日期早于其直接上级的所有雇员
select e1.* from emp e1,emp e2
where e1.mgr = e2.empno
and e1.hiredate > e2.hiredate;
--4. 找员工姓名和直接上级的名字
select e.ename,p.ename as "直接上级" from emp e,emp p where e.mgr=p.empno;
--5. 显示部门名称和人数
select dname,count(ename)as "人数" from emp e ,dept d  where e.deptno=d.deptno group by d.dname;
--6. 显示每个部门的最高工资的员工
select  * from emp e,(select  deptno,max(sal) m from emp group by deptno) a where e.sal = a.m;
--7. 显示每个部门的工资前 2名的员工
select * from (select rank() over(partition by deptno order by sal desc) r,e.ename,e.sal,e.deptno from emp e) where r <=2;
--8. 显示出和员工号 7369部门相同的员工姓名，工资
select e.ename,e.sal from emp e,(select empno,deptno from emp where empno=7369)  a where e.deptno=a.deptno;
--9. 显示出和姓名中包含"W"的员工相同部门的员工姓名
select e.ename from emp e,(select deptno from emp where ename like ‘%W%’) a where e.deptno=a.deptno;
--10. 显示出工资大于平均工资的员工姓名，工资
select e.ename,e.sal from emp e,(select avg(sal) a from emp) s where e.sal>s.a;
--11. 显示出工资大于本部门平均工资的员工姓名，工资
select e.ename,e.sal from emp e,(select deptno,avg(sal) avg from emp group by deptno) a where e.deptno=a.deptno and sal>avg;
--12. 显示员工"KING"所管理的员工姓名
select e.ename from emp e,(select empno from emp where ename='KING') a where e.mgr=a.empno;
--13. 显示每位经理管理员工的最低工资，及最低工资者的姓名
select e.ename,e.sal from emp e,(select min(sal) mins from emp group by mgr having mgr is not null) a where e.sal=a.mins;
--14. 显示比工资最高的员工参加工作时间晚的员工姓名，参加工作时间
select ename,hiredate from emp where hiredate>(select hiredate from emp where sal=(select max(sal) from emp));
--15. 显示出平均工资最高的的部门平均工资及部门名称select a.dname, b.s
  from dept a,
       (select *
          from (select avg(sal) s, deptno
                  from emp
                 group by deptno
                 order by avg(sal) desc)
         where rownum = 1) b
 where a.deptno = b.deptno;
