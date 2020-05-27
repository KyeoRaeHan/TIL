-- select 구문은 저장되어 있는 데이터를 가져올 때 사용한다.
-- select 컬럼명 from 테이블명

-- select * from 테이블명 => 테이블에 있는 모든 정보를 가져온다
-- 사원의 모든 정보를 가져올 경우 사원 정보는 employees 테이블에 있으므로 다음과 같이 작성한다
-- select * from employees

-- 사원의 정보를 모두 가져온다.
select *
from employees;

desc employees; 
-- desc = describe
-- 테이블 정보를 조회, 테이블을 만들때 나열해준 컬럼순으로 조회된다

-- 연습문제
-- 1. 부서정보를 모두 가져온다.
select *
from departments;

-- 2. 매니저의 모든 정보를 가져온다.
select *
from dept_manager;

-- 3. 사원들 직함 정보를 모두 가져온다.
select *
from titles;

-- 일부 컬럼만 가져오기
-- select 컬럼명1, 컬럼명2, 컬럼명3 from 테이블명

select emp_no, first_name, last_name 
from employees;

-- 연습문제
-- 사원의 사원번호, 생년월일, 성별을 가져온다.
select emp_no, birth_date, gender
from employees;

-- 부서의 부서번호, 이름을 가져온다
select deptno, dept_name
from departments;

select *
from departments;

-- 각 사원의 사원번호, 급여액을 가져온다.
select emp_no, salary
from salaries;

-- 각 사원의 사원번호, 지함 이름을 가져온다.
select emp_no, title
from titles;

-- select 문을 사용하면 데이터를 가져올 수 있다.
-- select * from 테이블명;
-- select 컬렴명1, 컬럼명2 from 테이블명;




 



