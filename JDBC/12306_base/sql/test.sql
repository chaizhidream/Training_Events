

--�����
select * from tab_user
select * from tab_city
select * from tab_usertype
select * from tab_province
select * from tab_certtype



--�����������
INSERT INTO tab_user VALUES (sq1.NEXTVAL, 'chai', 123456, 1, '����', 1,'�ػʵ���' , 1, '544554542', to_date('2000-11-26','yyyy-mm-dd'), 1, '��ע', 1, '127.0.0.1'��'C://a.jpg')


--��ѯoracle�ؼ��֣������ͻ
select * from v$reserved_words where keyword='SEX';


ALTER TABLE TAB_USER RENAME COLUMN "CONTENT" TO INFORMATION;
select username,sex from tab_user
