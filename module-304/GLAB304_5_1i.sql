select year(shipped_date) as year, count(id) as orderQty
from orders
group by year(shipped_date)
order by year(shipped_date);