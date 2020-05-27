-- 연산자 

-- -+: 더하기
-- 빼기
-- 곱하기
-- 


-- MYSQL에서는 연산자를 사용해서 컬럼을 가져올 수 있다.
select 20 + 10;
select 20 - 10;
select 20 * 10;
select 20 / 10;

select salary, salary + 1000, salary - 1000, salary * 1000, salary / 1000
from salaries;

-- 연습문제
-- 각 사원의 급여 10% 인상, 인하액 가져오기

select emp_no, salary, salary * 1.1
from salaries;

select emp_no, salary, salary * 0.9
from salaries;

-- 문자열 컬럼 연산
select first_name + 100
from employees;

-- distinct 연산자: 가져온 결과에서 '중복'을 제거한다
-- select distinct 컬럼명 from 테이블명

-- 근무 부서 테이블에서 부서 번호를 가져온다
select distinct dept_no
from dept_emp;

-- 연습문제
-- 각 사원의 직함을 중복되지 않게 가져온다.
select distinct title, from_date
from titles

-- 학습정리
-- 산술 연산자를 사용하면 데이터를 가져올 때 연산을 해서 가져올 수 있다.
-- distinct 연산자를 사용하면 '중복'을 제거할 수 있다.










