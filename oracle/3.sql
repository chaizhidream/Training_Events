﻿----第三章课后作业----------------------------------------------------------------------------------------------
--1. 选择部门 30中的雇员
SELECT * FROM EMP WHERE DEPTNO=30;;

--2. 列出所有办事员的姓名、编号和部门（jobid为'clerk’）
SELECT ename,empno,dname FROM emp  inner join dept  on emp.deptno = dept.deptno WHERE job='CLERK';
--3. 找出佣金高于薪金的雇员
　SELECT * FROM emp WHERE comm>sal;
--4. 找出佣金高于薪金 60%的雇员
　SELECT * FROM emp WHERE comm>sal*0.6
--5. 找出部门 10中所有经理和部门 20中的所有办事员的详细资料
SELECT * FROM emp WHERE (deptno=10 and job=upper('manager')) or (deptno=20 and job=upper('clerk '));

--6. 找出部门 10中所有经理、部门 20中所有办事员，既不是经理又不是办事员但其薪金>=2000的所有雇员的详细资料
　SELECT * FROM emp
 WHERE (deptno=10 and job=upper('manager')) or (deptno=20 and job=upper('clerk ')) or (job<>upper(‘manager’) and job<>upper(‘clerk’) and sal>=2000)
--7. 找出收取佣金的雇员的不同工作
　SELECT distinct job FROM emp WHERE nvl(comm,0)>0;
--8. 找出不收取佣金或收取的佣金低于 100的雇员
SELECT * FROM emp WHERE nvl(comm,0)<100;
--9. 显示 10号部门号码，部门名称
SELECT deptno,dname FROM dept WHERE deptno =10;
--10. 显示 82年之前参加工作的员工姓名，参加工作时间，工作名称
SELECT ename,
       hiredate,
       job
FROM emp
WHERE hiredate < to_date('82','yy');
--11. 显示姓名为"SMITH"的员工的员工姓名，参加工作时间，工作名称
SELECT ENAME,
       hiredate,
       job
       FROM emp
WHERE ENAME='SMITH';
--12. 显示工资在 2000到 4000之间的员工姓名，工资
SELECT ename,
       sal
FROM emp
WHERE sal BETWEEN 2000 AND 4000;
--13. .显示出总经理的姓名
SELECT ename
FROM emp
WHERE ename='PREZIDENT';
--14. 显示出姓名中倒数第二个字母为"R"的员工姓名
SELECT ename
FROM emp
WHERE ename LIKE '%R_';
--15. 显示姓名为"SMITH"或为"KING"的员工的员工姓名，参加工作时间，工作
SELECT ename,
       hiredate,
       job
FROM emp
WHERE ename IN('SMITH','KING');

--16. 显示工作名称中包含"MAN"并且工资大于 2000的员工姓名，工作
SELECT ename,
       job
FROM emp
WHERE job LIKE '%MAN%'
AND sal>2000;
--17. 名字中包含两个’L’，部门号是 30号，或经理号为 7782的员工
SELECT * FROM emp WHERE ename like '%L%L%'and (deptno=30 or mgr=7782);

----------------------------------------------------------------------------------------------------------------
