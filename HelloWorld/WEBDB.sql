-- ���̺� ����
CREATE TABLE emaillist (
  no number primary key,
  last_name varchar2(20),
  first_name varchar2(20),
  email varchar2(128),
  create_at date DEFAULT sysdate
);
-- ������
CREATE SEQUENCE seq_emaillist_pk
  START WITH 1
  INCREMENT BY 1;
-- ������ INSERT
INSERT INTO emaillist
VALUES(
  seq_emaillist_pk.nextval,
  '��' , '����',
  'teajinkim0@naver.com',
   sysdate);
COMMIT;
SELECT * FROM emaillist;