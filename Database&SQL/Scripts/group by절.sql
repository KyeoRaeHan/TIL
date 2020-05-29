-- 사원의 수를 성별로 구분하여 가져온다.
select gender, count(*) from employees
group by gender;

-- 각 부서에 근무하고 있는 사원들의 수를 가져온다.
select * from dept_emp;

select  dept_no, count(*)
from dept_emp
where to_date = '9999-01-01'
group by dept_no;

-- 각 부서별 과거의 매니저의 수를 구한다
select * from dept_manager
where to_date = '9999-01-01'
group by dept_no;


-- 급여 수령 시작일별 급여 총합을 구한다.
select from_date, sum(salary)
from salaries
group by from_date;

-- 급여 수령 시작일별 급여 평균을 구한다.

-- 급여 수령 시작일별 급여 최고액을 구한다.
select from_date, max(salary)
from salaries
group by from_date;

-- 급여 수령 시작일별 급여 최저액을 구한다.

-- having절
-- group by 절을 이용하여 개발자가 정한 기준으로 그룹을 나눈후 having 절로 만든 조건에 맞는 그룹의 데이터만 가져올 수 있다.

-- 10만명 이상이 사용하고 있는 직함의 이름과 직원의 수를 가져온다.
select title, count(*)
from titles
group by title
having count(*) >= 100000;

desc titles;

-- 5만명이상 근무하고 있는 부서의 부서 번호와 부서 소속 사원 수를 가져온다
select dept_no, count(*)
from dept_emp
group by dept_no
having count(*) >= 50000;

-- 학습정리
-- group by절을 이용하면 데이터를 그룹별로 나눠 가져올 수 있다.
-- Having절을 이용하면 원하는 그룹의 데이터만 가져올 수 있다.




