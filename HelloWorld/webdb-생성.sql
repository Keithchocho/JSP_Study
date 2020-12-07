ALTER SESSION SET "_ORACLE_SCRIPT"=true;

-- 사용자 생성 -- 

CREATE USER webdb IDENTIFIED BY webdb;

-- DB 접속 권한 부여

GRANT CONNECT, RESOURCE TO webdb;

--table quota
ALTER USER webdb DEFAULT TABLESPACE users
  QUOTA unlimited on users;