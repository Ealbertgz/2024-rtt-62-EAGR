select customer_name, country, sales_rep_employee_id
from customers
where sales_rep_employee_id is not null
order by customer_name;