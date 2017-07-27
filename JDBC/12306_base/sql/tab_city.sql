--prompt Creating TAB_CITY...
create table TAB_CITY
(
  cityname   VARCHAR2(50) not null,
  father NUMBER(12) not null,
  cityid  NUMBER(12) not null
)
tablespace USERS
pctfree 10 --块保留10%的空间留给更新该块数据使用
initrans 1 --初始化事务槽的个数
maxtrans 255 --最大事务槽的个数
storage --存储参数
(  
initial 64k --区段(extent)一次扩展64k
minextents 1 --最小区段数
maxextents unlimited --最大区段无限制  
); 

  --对表的注释的内容
comment on column TAB_CITY.cityname
  is '市名称';
comment on column TAB_CITY.father
  is '省份标识ID';
  comment on column TAB_CITY.cityid
  is '市标识ID';
  
  
  
alter table TAB_CITY
  add constraint TAB_CITY_PK primary key (cityname)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
  
  
  
  insert into TAB_CITY (cityname, father,cityid)
values ('北京市', '110000','110100');
insert into TAB_CITY (cityname, father,cityid)
values ('天津市', '120000','120100');
insert into TAB_CITY (cityname, father,cityid)
values ('石家庄市', '130000', '130100');
insert into TAB_CITY (cityname, father,cityid)
values ('唐山市', '130000', '130200');
insert into TAB_CITY (cityname, father,cityid)
values ('秦皇岛市', '130000', '130300');
insert into TAB_CITY (cityname, father,cityid)
values ('邯郸市', '130000', '130400');
insert into TAB_CITY (cityname, father,cityid)
values ('邢台市', '130000', '130500');
insert into TAB_CITY (cityname, father,cityid)
values ('保定市', '130000', '130600');


commit;