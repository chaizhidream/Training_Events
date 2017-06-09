create table  student(
xh char(4), --学号
xm varchar2(10), --姓名
sex char(4), --性别
birthday date, --日期
sal number(7,2), --奖学金
studentcid number(2) --学生班级号
);

create table  class (
classid number(2), --班级编号
cname varchar2(20), --班级名字
ccount number(3) --班级人数
);

insert into  class values (1,'JAVA1班',null);
insert into  class values (2,'JAVA2班',null);
insert into  class values (3,'JAVA3班',null);



insert into  student 
values ('A001','张三','男','01-5月-05',100,1);

alter session set nls_date_format='YYYY-MM-DD';

insert into  student 
values ('A002','MIKE','男','1905-05-06',10,null);

insert into  student (xh,xm,sex)
values  ('A003','JOHN','女');

update student  set sex='女'  where xh='A001';
update student  set sex='男' ，birthday= '1980-04-01' where xh='A001';

update student set studentcid=3 where birthday is null;

update class c set ccount=(select count(*) from student s where c.classid=s.studentcid); 
