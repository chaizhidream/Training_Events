--prompt Creating TAB_CITY...
create table TAB_CITY
(
  cityname   VARCHAR2(50) not null,
  father NUMBER(12) not null,
  cityid  NUMBER(12) not null
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
comment on column TAB_CITY.cityname
  is '������';
comment on column TAB_CITY.father
  is 'ʡ�ݱ�ʶID';
  comment on column TAB_CITY.cityid
  is '�б�ʶID';
  
  
  
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
values ('������', '110000','110100');
insert into TAB_CITY (cityname, father,cityid)
values ('�����', '120000','120100');
insert into TAB_CITY (cityname, father,cityid)
values ('ʯ��ׯ��', '130000', '130100');
insert into TAB_CITY (cityname, father,cityid)
values ('��ɽ��', '130000', '130200');
insert into TAB_CITY (cityname, father,cityid)
values ('�ػʵ���', '130000', '130300');
insert into TAB_CITY (cityname, father,cityid)
values ('������', '130000', '130400');
insert into TAB_CITY (cityname, father,cityid)
values ('��̨��', '130000', '130500');
insert into TAB_CITY (cityname, father,cityid)
values ('������', '130000', '130600');


commit;