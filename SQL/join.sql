select tb_emp.emp_no, tb_emp.emp_name, tb_emp.org_cd
    ,tb_org.org_name, tb_emp.position

    
from tb_emp, tb_org
where tb_emp.org_cd = tb_org.org_cd;


select e.emp_no, e.emp_name, e.org_cd, o.org_name, e.position
from tb_emp as e, tb_org as o 
where e.org_cd = o.org_cd 
and e.position = '����';
--order by o.org_name;

select a.accno, c.cust_name, p.prod_name, a.cont_amt, e.emp_name
from tb_accnt a, tb_cust c, tb_prod p, tb_emp e 
where a.cust_no = c.cust_no 
and a.prod_cd = p.prod_cd 
and a.manager = e.emp_no;

select e.emp_name as �����, e.salary as ����, s.grade as �޿����
from tb_emp e, tb_grade s
where e.salary between s.low_sal and s.high_sal;

select a.accno as ���¹�ȣ, c.cust_name as ����, p.prod_name as ��ǰ��
        , a.cont_amt as ���ݾ�, e.emp_name as ����ڸ�
from tb_accnt a, tb_cust c, tb_prod p, tb_emp e 
where a.cust_no = c.cust_no
and a.prod_cd = p.prod_cd
and a.manager = e.emp_no;