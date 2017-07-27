说明：
实际数据库经过修改，具体请参见Excel文档
先按顺序执行五个tab_XX.sql文件
别忘了为user表创建主键自增长


由于修改过数据库，暂不执行insert.sql 插入城市数据



执行方法为复制文件的全部内容到pl/sql的SQL窗口，全选后点击运行

你可以使用下面的语句查看序列是否已经创建：

--查看某位用户的所有序列  
select SEQUENCE_OWNER,SEQUENCE_NAME from dba_sequences where sequence_owner='数据库用户名';
--删除序列
drop sequence 表名;

测试用例请参见test.sql