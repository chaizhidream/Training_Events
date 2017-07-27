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
  is '�û���';
comment on column TAB_USER.psd
  is '����';
comment on column TAB_USER.ru
  is 'Ȩ��(1������Ա 2����ͨ�û�)';
comment on column TAB_USER.realname
  is '��ʵ����';
comment on column TAB_USER.sex
  is '�Ա�(1���� 2��Ů)';
comment on column TAB_USER.cityname
  is '������';
comment on column TAB_USER.ctypeid
  is '֤�������ֵ�IDֵ';
comment on column TAB_USER.cert
  is '֤������';
comment on column TAB_USER.birthday
  is '����';
comment on column TAB_USER.utypeid
  is '�ÿ������ֵ�IDֵ';
comment on column TAB_USER.information
  is '��ע��Ϣ';
comment on column TAB_USER.status
  is '�û�״̬��0����Ч  1����Ч ��';
comment on column TAB_USER.login_ip
  is '��½IP';
comment on column TAB_USER.image_path
  is '�û�ͷ��·��';
  
  
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

  
  
  --��������

create sequence userid
start with 1
increment by 1
minvalue 1
maxvalue 9999999
nocycle
nocache
noorder;

--�������������У�
alter table TAB_USER enable all triggers;

create or replace trigger pn_trigger
before insert on tab_user
for each row
begin
    select userid.nextval into:new.id from sys.dual;
end;

