select tb_emp.emp_no, tb_emp.emp_name, tb_emp.org_cd
    ,tb_org.org_name, tb_emp.position

    
from tb_emp, tb_org
where tb_emp.org_cd = tb_org.org_cd;


select e.emp_no, e.emp_name, e.org_cd, o.org_name, e.position
from tb_emp as e, tb_org as o 
where e.org_cd = o.org_cd 
and e.position = '팀장';
--order by o.org_name;

select a.accno, c.cust_name, p.prod_name, a.cont_amt, e.emp_name
from tb_accnt a, tb_cust c, tb_prod p, tb_emp e 
where a.cust_no = c.cust_no 
and a.prod_cd = p.prod_cd 
and a.manager = e.emp_no;

select e.emp_name as 사원명, e.salary as 연봉, s.grade as 급여등급
from tb_emp e, tb_grade s
where e.salary between s.low_sal and s.high_sal;

select a.accno as 계좌번호, c.cust_name as 고객명, p.prod_name as 상품명
        , a.cont_amt as 계약금액, e.emp_name as 담당자명
from tb_accnt a, tb_cust c, tb_prod p, tb_emp e 
where a.cust_no = c.cust_no
and a.prod_cd = p.prod_cd
and a.manager = e.emp_no;