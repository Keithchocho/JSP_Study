-- 테이블 생성
CREATE TABLE emaillist (
  no number primary key,
  last_name varchar2(20),
  first_name varchar2(20),
  email varchar2(128),
  create_at date DEFAULT sysdate
);
-- 시퀀스
CREATE SEQUENCE seq_emaillist_pk
  START WITH 1
  INCREMENT BY 1;
-- 데이터 INSERT
INSERT INTO emaillist
VALUES(
  seq_emaillist_pk.nextval,
  '김' , '도훈',
  'teajinkim0@naver.com',
   sysdate);
COMMIT;
SELECT * FROM emaillist;