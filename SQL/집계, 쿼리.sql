select count(*) "��ü�Ǽ�"
        ,count(position) "��å�Ǽ�"
        ,count(distinct position) "��å����"
        ,max(salary) "�ִ�"
        ,min(salary) "�ּ�"
        ,avg(salary) "���"

from tb_emp;


select position as ��å, count(*) as �ο���, min(salary) as �ּ�, max(salary) as �ִ�, avg(salary) as ���
from tb_emp
group by position;

select org_cd as �μ�, count(*) as �ο���, avg(salary) as ���
from tb_emp te 
group by org_cd 
having  count(*) >= 4;

select org_cd, position, avg(salary)
from tb_emp te 
where position in('����', '�븮', '���')
group by org_cd, position