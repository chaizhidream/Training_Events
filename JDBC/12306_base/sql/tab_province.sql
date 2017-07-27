--prompt Creating TAB_PROVINCE...
create table TAB_PROVINCE
(   
  provinceid NUMBER(12) not null,
  province   VARCHAR2(40) not null
  
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


comment on column TAB_PROVINCE.provinceid
  is '省份标识ID';
comment on column TAB_PROVINCE.province
  is '省份名称';
  
alter table TAB_PROVINCE
  add constraint TAB_PROVINCE_PK primary key (provinceid)
  
  
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
  
  
insert into TAB_PROVINCE (provinceid, province)
values ('110000', '北京');
insert into TAB_PROVINCE (provinceid, province)
values ('120000', '天津');
insert into TAB_PROVINCE (provinceid, province)
values ('130000', '河北省');
insert into TAB_PROVINCE (provinceid, province)
values ('140000', '山西省');
insert into TAB_PROVINCE (provinceid, province)
values ('150000', '内蒙古自治区');
insert into TAB_PROVINCE (provinceid, province)
values ('210000', '辽宁省');
insert into TAB_PROVINCE (provinceid, province)
values ('220000', '吉林省');
insert into TAB_PROVINCE (provinceid, province)
values ('230000', '黑龙江省');
insert into TAB_PROVINCE (provinceid, province)
values ('310000', '上海');
insert into TAB_PROVINCE (provinceid, province)
values ('320000', '江苏省');
insert into TAB_PROVINCE (provinceid, province)
values ('330000', '浙江省');
insert into TAB_PROVINCE (provinceid, province)
values ('340000', '安徽省');
insert into TAB_PROVINCE (provinceid, province)
values ('350000', '福建省');
insert into TAB_PROVINCE (provinceid, province)
values ('360000', '江西省');
insert into TAB_PROVINCE (provinceid, province)
values ('370000', '山东省');
insert into TAB_PROVINCE (provinceid, province)
values ('410000', '河南省');
insert into TAB_PROVINCE (provinceid, province)
values ('420000', '湖北省');
insert into TAB_PROVINCE (provinceid, province)
values ('430000', '湖南省');
insert into TAB_PROVINCE (provinceid, province)
values ('440000', '广东省');
insert into TAB_PROVINCE (provinceid, province)
values ('450000', '广西壮族自治区');
insert into TAB_PROVINCE (provinceid, province)
values ('460000', '海南省');
insert into TAB_PROVINCE (provinceid, province)
values ('500000', '重庆');
insert into TAB_PROVINCE (provinceid, province)
values ('510000', '四川省');
insert into TAB_PROVINCE (provinceid, province)
values ('520000', '贵州省');
insert into TAB_PROVINCE (provinceid, province)
values ('530000', '云南省');
insert into TAB_PROVINCE (provinceid, province)
values ('540000', '西藏自治区');
insert into TAB_PROVINCE (provinceid, province)
values ('610000', '陕西省');
insert into TAB_PROVINCE (provinceid, province)
values ('620000', '甘肃省');
insert into TAB_PROVINCE (provinceid, province)
values ('630000', '青海省');
insert into TAB_PROVINCE (provinceid, province)
values ( '640000', '宁夏回族自治区');
insert into TAB_PROVINCE (provinceid, province)
values ('650000', '新疆维吾尔自治区');
insert into TAB_PROVINCE (provinceid, province)
values ('710000', '台湾省');
insert into TAB_PROVINCE (provinceid, province)
values ('810000', '香港特别行政区');
insert into TAB_PROVINCE (provinceid, province)
values ('820000', '澳门特别行政区');
commit;
