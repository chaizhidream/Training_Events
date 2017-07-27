--prompt Creating TAB_PROVINCE...
create table TAB_PROVINCE
(   
  provinceid NUMBER(12) not null,
  province   VARCHAR2(40) not null
  
)
tablespace USERS
pctfree 10 --�鱣��10%�Ŀռ��������¸ÿ�����ʹ��
initrans 1 --��ʼ������۵ĸ���
maxtrans 255 --�������۵ĸ���
storage --�洢����
(  
initial 64k --����(extent)һ����չ64k
minextents 1 --��С������
maxextents unlimited --�������������  
); 
  --�Ա��ע�͵�����


comment on column TAB_PROVINCE.provinceid
  is 'ʡ�ݱ�ʶID';
comment on column TAB_PROVINCE.province
  is 'ʡ������';
  
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
values ('110000', '����');
insert into TAB_PROVINCE (provinceid, province)
values ('120000', '���');
insert into TAB_PROVINCE (provinceid, province)
values ('130000', '�ӱ�ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('140000', 'ɽ��ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('150000', '���ɹ�������');
insert into TAB_PROVINCE (provinceid, province)
values ('210000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('220000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('230000', '������ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('310000', '�Ϻ�');
insert into TAB_PROVINCE (provinceid, province)
values ('320000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('330000', '�㽭ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('340000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('350000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('360000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('370000', 'ɽ��ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('410000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('420000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('430000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('440000', '�㶫ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('450000', '����׳��������');
insert into TAB_PROVINCE (provinceid, province)
values ('460000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('500000', '����');
insert into TAB_PROVINCE (provinceid, province)
values ('510000', '�Ĵ�ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('520000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('530000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('540000', '����������');
insert into TAB_PROVINCE (provinceid, province)
values ('610000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('620000', '����ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('630000', '�ຣʡ');
insert into TAB_PROVINCE (provinceid, province)
values ( '640000', '���Ļ���������');
insert into TAB_PROVINCE (provinceid, province)
values ('650000', '�½�ά���������');
insert into TAB_PROVINCE (provinceid, province)
values ('710000', '̨��ʡ');
insert into TAB_PROVINCE (provinceid, province)
values ('810000', '����ر�������');
insert into TAB_PROVINCE (provinceid, province)
values ('820000', '�����ر�������');
commit;
