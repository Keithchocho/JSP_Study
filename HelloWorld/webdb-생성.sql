ALTER SESSION SET "_ORACLE_SCRIPT"=true;

-- ����� ���� -- 

CREATE USER webdb IDENTIFIED BY webdb;

-- DB ���� ���� �ο�

GRANT CONNECT, RESOURCE TO webdb;

--table quota
ALTER USER webdb DEFAULT TABLESPACE users
  QUOTA unlimited on users;