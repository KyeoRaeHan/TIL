create database test_db
character set = 'utf8'
collate = 'utf8_general_ci';

-- DROP database test_db  : 테이블 제거

use test_db;

create table test_table1(
data1 int(10), -- 자료형
data2 varchar(10),
data3 float(10,2)
);

desc test_table1; -- 테이블정보 조회

select * from test_table; -- 테이블을 만들었지만, 아무 정보도 저장하지 않았기때문에 아무것도 조회되지 않는다

-- 서브쿼리를 이용한 테이블 생성하기
-- select문을 통해 가져온 결과를 이용해 테이블을 생성할 때 사용한다.
-- create table 테이블 명
-- as
-- select문

use employees;
select * from departments;

create table dept1
as
select * from departments;

desc dept1;

-- dept2

create table dept3
as
select dept_no from departments;

desc dept3;
select * from dept3;

-- 학습정리
-- create문을 이용하여 데이터베이스와 테이블을 생성할 수 있다.






   