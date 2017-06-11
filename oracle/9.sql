/*1.请分析按照以下要求都需要建立什么类型的字段
(1)最大2000个字节定长字符串    --char(2000)
(2)如果输入’张三’ 后添空格6个 --char(10)
(3)性别输入’男’或’女’--char(2)
(4)最大4000个字节变长字符串  varchar2(4000)
(5)如果在数据库中输入'张三'则显示数据'张三'  NVARCHAR2(10)
(6)表示数字范围为10的-38次方到10的38次方, 可以表示小数,也可以表示整数--NUMBER
(7)最大表示4位整数  -9999 到 9999 --NUMBER(4)
(8)表示5位有效数字 2位小数的 一个小数  -999.99 到 999.99 --NUMBER(5,2)
(9)包含年月日和时分秒  7个字节 --DATE
(10)二进制大对象图像/声音  4G   --BLOB
*/

 --2.创建表空间 mttabase
 create tablespace mttabase 
 datafile 'D:\biancheng\oracle\oradata\orcl/mydata.dbf'
 size 5mextent management local;
 
 --3
 CREATE TABLE student   (
       xh char(4) NOT NULL,
       xm varchar2(10),
       sex char(2),
       birthday DATE,
       sal number(7,2),
       CONSTRAINT pk_xh Primary KEY (xh)     
);

CREATE TABLE CLASS   (
       classid char(4) NOT NULL,
       NAME varchar2(10),
       su number(7),
       CONSTRAINT pk_class_id Primary KEY (classid)     
);

ALTER TABLE student ADD(classid CHAR(4));

ALTER TABLE student MODIFY(xm VARCHAR(12));

ALTER TABLE student MODIFY(xh CHAR(5));

UPDATE CLASS c SET su=(SELECT COUNT(*) from student s WHERE c.classid= s.classid);
 
--4.创建copy_dept，要求格式同dept表完全一样，不包含数据
CREATE TABLE copy_dept AS SELECT * FROM dept WHERE 1=2
--5.创建copy_emp，要求格式同emp表完全一样，不包含数据
CREATE TABLE copy_emp AS SELECT * FROM emp WHERE 1=2
--6.设置copy_emp表中外键deptno，参照copy_dept中deptno,语句能否成功,为什么？
ALTER TABLE copy_emp ADD CONSTRAINT pk_deptno PRIMARY KEY(deptno) REFERENCES copy_dept(deptno); 不能
--7.设置copy_dept表中主键deptno
ALTER TABLE copy_dept ADD CONSTRAINT pk_depno PRIMARY KEY(deptno)
