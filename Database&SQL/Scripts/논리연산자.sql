-- 논리연산자
-- 두 개 이상의 조건문을 작성할 때 사용하는 연산자
-- and: 양쪽 조건을 모두 만족해야 한다.
-- or: 양쪽 조건 중 하나만 만족해도 선택된다.
-- not: 조건의 결과를 반대로 부정한다.

-- 연습문제
-- d001 부서의 매니저 중에서 1990년 이후 부터 매니저인 사원의 사원번호, 부서번호, 매니저
-- 시작 날짜를 가져온다.

select emp_no, dept_no, from_date
from dept_manager
where dept_no='d001' and from_date >= '1990-01-01';

-- 1990년 이후부터 60000 이상의 급여를 받는 사원의 사원번호, 급여, 급여 수령 시작 날짜를 가져온다

select emp_no, salary, from_date
from salaries
where from_date >= '1990-01-01' and salary >=60000;

-- d001 부서와 d002 부서 매니저의 사원번호, 부서번호를 가져온다.
select emp_no, dept_no
from dept_manager
where dept_no = 'd001' or dept_no = 'd002';

-- 직함이 staff인 사원과 Engineer인 사원의 사원번호, 직함을 가져완다
select emp_no, title
from titles
where title = 'Staff' or title = 'Engineer';

-- d003 부서의 매니저가 아닌 매니저의 사원번호 부서 번호를 가져온다.
select emp_no, dept_no
from dept_manager
where not dept_no = 'd003';

-- Between
-- 컬럼의 범위를 조건으로 사용할 때 사용한다.
-- and 대신 사용한다.
-- 컬럼명 between 값1 and 값2

-- 급여가 60000이상 70000미만인 사원의 사원번호, 급여를 가져온다
select emp_no, salary
from salaries
where salary >= 60000 and salary < 70000;

select emp_no, salary
from salaries
where salary between 60000 and 69999;

-- in
-- 지정된 컬럼의 값이 특정 값에 해당되는 조건을 만들 때 사용한다
-- or 대신 사용한다.
-- '컬럼명 in (값1, 값2, ..)'

-- d001부서와 d002부서 매니저의 사원번호, 부서번호를 가져온다.
select emp_no, dept_no
from dept_manager
where dept_no = 'd001' or dept_no = 'd002';

select emp_no, dept_no
from dept_manager
where dept_no in('d001', 'd002'); 

-- 학습정리
-- and, or, not을 사용해 조건식에 대한 작업을 할 수 있다
-- between을 사용하면 범위에 대한 조건을 만들 수 있다.
-- in을 사용하면 지정된 값과 일치되는 조건을 만들 수 있다.

