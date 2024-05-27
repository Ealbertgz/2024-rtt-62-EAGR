select day(order_date) as dayofmonth, count(*)
from orders where year(order_date) = 2004
group by dayofmonth
order by dayofmonth;