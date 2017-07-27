--prompt Creating TAB_USER...
create table TAB_USER
(
  id         NUMBER(11) not null,
  username   VARCHAR2(30) not null,
  pSD   VARCHAR2(50) not null,
  ru       number(4) default '2' not null,
  realname   VARCHAR2(50) not null,
  sex        number(4) default '1' not null,
  cityname    VARCHAR2(30),
  ctypeid  NUMBER(11) not null,
  cert       VARCHAR2(50) not null,
  birthday   DATE ,
  utypeid  NUMBER(11)not null,
  INFORMATION    VARCHAR2(3000),
  status     number(4) default '1' not null,
  login_ip   VARCHAR2(50),
  image_path VARCHAR2(200)
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
comment on column TAB_USER.id
  is 'ID';
comment on column TAB_USER.username
  is '用户名';
comment on column TAB_USER.psd
  is '密码';
comment on column TAB_USER.ru
  is '权限(1、管理员 2、普通用户)';
comment on column TAB_USER.realname
  is '真实姓名';
comment on column TAB_USER.sex
  is '性别(1、男 2、女)';
comment on column TAB_USER.cityname
  is '市名称';
comment on column TAB_USER.ctypeid
  is '证件类型字典ID值';
comment on column TAB_USER.cert
  is '证件号码';
comment on column TAB_USER.birthday
  is '生日';
comment on column TAB_USER.utypeid
  is '旅客类型字典ID值';
comment on column TAB_USER.information
  is '备注信息';
comment on column TAB_USER.status
  is '用户状态（0、无效  1、有效 ）';
comment on column TAB_USER.login_ip
  is '登陆IP';
comment on column TAB_USER.image_path
  is '用户头像路径';
  
  
alter table TAB_USER
  add constraint TAB_USER_PK primary key (ID)
  
  
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
  
alter table TAB_USER
  add constraint TAB_USER_UK unique (USERNAME)
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
  
  
alter table TAB_USER
  add constraint TAB_USER_CERTTYPE_FK foreign key (CTYPEid)
  references TAB_CERTTYPE (ctypeid);
  
alter table TAB_USER
  add constraint TAB_USER_CITY_FK foreign key (CITYname)
  references TAB_CITY (cityname);
  
alter table TAB_USER
  add constraint TAB_USER_USERTYPE_FK foreign key (UTYPEid)
  references TAB_USERTYPE (UTYPEid);

  
  
  --建立索引

create sequence userid
start with 1
increment by 1
minvalue 1
maxvalue 9999999
nocycle
nocache
noorder;

--开启自增长序列，
alter table TAB_USER enable all triggers;

create or replace trigger pn_trigger
before insert on tab_user
for each row
begin
    select userid.nextval into:new.id from sys.dual;
end;

