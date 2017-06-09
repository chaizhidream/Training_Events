CREATE TABLE copy_emp   (
  empno number(4),
  ename varchar2(20),
  hiredate date default sysdate ,
  deptno number(2),
  sal number(8,2)
); 


SELECT * FROM copy_emp;

INSERT INTO copy_emp 
VALUES(01,'demo',to_date('2000-01-01','yyyy-mm-dd'),50,NULL);


INSERT INTO copy_emp(empno,ename,hiredate,deptno,sal)
       SELECT empno,ename,hiredate,deptno,sal FROM emp WHERE deptno=10;

UPDATE copy_emp SET sal=sal*1.2 WHERE deptno=10;

UPDATE copy_emp 
SET sal=(SELECT AVG(sal) FROM copy_emp) 
WHERE sal IS NULL;

UPDATE copy_emp 
SET sal=NULL,hiredate=default 
WHERE sal=(SELECT AVG(sal) FROM copy_emp);

DELETE FROM copy_emp WHERE sal IS NULL;

ROLLBACK;
