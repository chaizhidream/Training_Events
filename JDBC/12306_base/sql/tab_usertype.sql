
--prompt Creating TAB_USERTYPE...
create table TAB_USERTYPE
(
  UTYPEID    NUMBER(11) not null,
  UTYPE VARCHAR2(40) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
  
comment on column TAB_USERTYPE.UTYPEID
  is '旅客ID';
comment on column TAB_USERTYPE.utype 
  is '旅客类型';
  
alter table TAB_USERTYPE
  add constraint TAB_USERTYPE_PK primary key (UTYPEID)
  
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

insert into TAB_USERTYPE (UTYPEID, utype)
values (1, '成人');
insert into TAB_USERTYPE (UTYPEID, utype)
values (2, '儿童');
insert into TAB_USERTYPE (UTYPEID, utype)
values (3, '学生');
insert into TAB_USERTYPE (UTYPEID, utype)
values (4, '残疾军人、伤残人民警察');
commit;