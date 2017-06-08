﻿----第二章课后作业----------------------------------------------------------------------------------------------
--1.显示部门表的全部信息
SELECT * FROM DEPARTMENTS;

--2.显示部门号码，部门名称
SELECT  DEPARTMENT_ID,DEPARTMENT_NAME FROM DEPARTMENTS;

--3.显示以下字段及字符串的连接：员工名 ，" 1个月的工资为： " ，工资 。如：Amy1个月的工资为：8000
SELECT FIRST_NAME||' '||LAST_NAME ||'1个月的工资为:'||SALARY FROM EMPLOYEES;

--4.显示员工姓名，参加工作时间，工作
SELECT FIRST_NAME,HIRE_DATE,JOBS.JOB_TITLE 
FROM EMPLOYEES,JOBS 
WHERE EMPLOYEES.JOB_ID=JOBS.JOB_ID;
--5.显示员工姓名：别名为 Name，年薪（13个月的月薪）：别名为 annual salary。 注：别名大小写
SELECT (FIRST_NAME||' '||LAST_NAME)"Name",（SALARY*13）"annual salary" FROM EMPLOYEES;

--6.把员工姓名，工作名称(job)作为一个字符串显示
SELECT FIRST_NAME||' '||LAST_NAME||' '||JOB_ID FROM EMPLOYEES;

--7.显示以下字段及字符串的连接：员工名 ，" 's job is " ，工作名称 。如：Amy's jobis MANAGER 注：单引号需显示出
SELECT FIRST_NAME||' '||LAST_NAME||'''s job is '||JOBS.JOB_TITLE 
FROM EMPLOYEES,JOBS 
WHERE EMPLOYEES.JOB_ID=JOBS.JOB_ID;

--8.显示员工表中部门号，工作名称，要求去掉重复值
SELECT distinct EMPLOYEE_ID, JOB_ID FROM EMPLOYEES;
----------------------------------------------------------------------------------------------------------------
