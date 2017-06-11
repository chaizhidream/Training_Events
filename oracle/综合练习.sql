--drop table Student;
--drop table Subject;
--drop table Grade;

CREATE table student(
Studentid int primary key,--主键,学号
StudentName char(10) NOT NULL --学生姓名
);

CREATE table Subject(
SubjectID varchar(10) primary key, --主键，课程编号
SubjectName char(20) NOT NULL --课程名
);
 
--alter table subject modify subjectid varchar(10);

CREATE table Grade(
Studentid  int, --联合主键,学生编号
SubjectID varchar(10), --联合主键,课程编号
Grade number NOT NULL, --成绩
primary key (studentid,subjectid)
);

insert into Student values (101,'张三');
insert into Student values (102,'李云');
insert into Student values (103,'未');
insert into Subject values ('A01','C++');
insert into Subject values ('A02','ASP');
insert into Subject values ('A03','JAVA');

insert into Grade values (101,'A01',59);
insert into Grade values (101,'A02',72);
insert into Grade values (101,'A03',90);
insert into Grade values (102,'A01',75);
insert into Grade values (102,'A02',91);
insert into Grade values (103,'A01',71);

select * from student;
select * from subject;
select * from grade;

--（1）学号 学生姓名 课程名称 成绩 （要全部学生信息）
select s.studentid,s.studentname,sb.subjectname,g.grade 
from student s,subject sb,grade g 
where  s.studentid=g.studentid and to_char(sb.subjectid)=to_char(g.subjectid);
--varchar型数据必须被显示转换

--（2）学号 学生姓名 课程名称 成绩（只显示每科最高分）
select s.studentid,s.studentname,sb.subjectname,g.grade 
 from student s,subject sb,grade g 
  where  s.studentid=g.studentid and to_char(sb.subjectid)=to_char(g.subjectid)
   and (subjectname,grade)  in (select subjectname "课程名称",max(grade) "成  绩" from student s,subject sb,grade g 
    where s.studentid = g.studentid and sb.subjectid = g.subjectid group by subjectname) 


--方法②
  select s.studentid "学  号",studentname "学生姓名", subjectname "课程名称",grade "成  绩"
    from student s,subject sb,grade g 
      where s.studentid = g.studentid  
        and sb.subjectid = g.subjectid  
          and (
              select count(*) from grade 
                       where subjectid = sb.subjectid and grade > g.grade) = 0 ;
                       
--（3）学号 学生姓名 课程名称 成绩 （成绩大于 60时的显示及格，小于 60时的显示不及格）
 select s.studentid "学  号",studentname "学生姓名", subjectname "课程名称",
  decode(sign(grade-60),-1,'不及格','及格') "成  绩" 
   from student s,subject sb,grade g 
     where s.studentid = g.studentid and sb.subjectid = g.subjectid ;
  
--（4）学号 学生姓名 （查询出选课超过 1门以上学生的信息）
select s.studentid "学  号",studentname "学生姓名", count(subjectname) 
 from student s , subject sb , grade g 
  where s.studentid = g.studentid 
   and sb.subjectid = g.subjectid 
     group by s.studentid,studentname 
       having count(subjectname) >= 2; 
