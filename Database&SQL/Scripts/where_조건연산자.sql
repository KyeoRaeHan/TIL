-- where 절의 정의 정리

-- 조건 사용하기
-- select구문에 where 절을 사용하면 조건을 설정할 수 있다
-- 컬럼에 저장되어 있는 데이터를 기준으로 검색하여 원하는 데이터만 가져올 수 있다.

-- 조건 연산자
-- 조건식을 만들 때 사용하는 연산자

-- -= 같다
-- -> 크다
-- -< 작다
-- ->= 크거나 같다
-- -<= 작거나 같다
-- -<> 다르다

-- where 절 사용하기
-- select 문에서 where 키워드를 사용하면 조건을 사용할 수 있다
-- d005부서 매니저의 사원의 사원번호, 부서번호를 가져온다
select emp_no, dept_no
from dept_manager
where dept_no = 'd005';

where 절 사용하기
-- d003 부서의 매니저가 아닌 매니저들의 사원번호, 부서번호를 가져온다
-- 급여가 150000 이상인 사원들의 사원 번호, 급여를 가져온다.
-- 급여가 40000 이하인 사원들의 사원 번호, 급여를 가져온다.

select emp_no, dept_no
from dept_manager
where dept_no <> 'd003'; -- 수정 필요


select emp_no, salary
from salaries
where salary >= 150000;

select emp_no, salary
from salaries
where salary =< 40000;

-- 1986년 이후에 입사한 사원들의 사원번호, 입사일, 성과 이름을 갖완다
select emp_no, hire_date, last_name, first_name
from employees
where hire_date >= '1986-01-01';

-- 1990년 이전에 입사한 사원들의 사원번호, 입사일을 가져온다.
select emp_no, hire_date
from employees
where hire_date < '1990-01-01';

-- 학습정리
-- where절을 사용하면 데이터를 가져올 때 조건을 설정할 수 있다.








