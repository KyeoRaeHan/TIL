select count(*) "전체건수"
        ,count(position) "직책건수"
        ,count(distinct position) "직책종류"
        ,max(salary) "최대"
        ,min(salary) "최소"
        ,avg(salary) "평균"

from tb_emp;


select position as 직책, count(*) as 인원수, min(salary) as 최소, max(salary) as 최대, avg(salary) as 평균
from tb_emp
group by position;

select org_cd as 부서, count(*) as 인원수, avg(salary) as 평균
from tb_emp te 
group by org_cd 
having  count(*) >= 4;

select org_cd, position, avg(salary)
from tb_emp te 
where position in('과장', '대리', '사원')
group by org_cd, position