--prompt Creating TAB_CERTTYPE...
create table TAB_CERTTYPE
(
  ctypeid      NUMBER(11) not null,
  ctype VARCHAR2(20) not null
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
  
comment on column TAB_CERTTYPE.ctypeid
  is '֤��ID';
comment on column TAB_CERTTYPE.ctype
  is '֤������';
  
  
alter table TAB_CERTTYPE
  add constraint TAB_CERTTYPE_PK primary key (ctypeid)
  
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
  
insert into TAB_CERTTYPE (ctypeid, ctype)
values (1, '�������֤');
insert into TAB_CERTTYPE (ctypeid, ctype)
values (2, '�۰�ͨ��֤');
insert into TAB_CERTTYPE (ctypeid, ctype)
values (3, '̨��ͨ��֤');
insert into TAB_CERTTYPE (ctypeid, ctype)
values (4, '����');
commit;
