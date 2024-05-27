select id, datediff(required_date, shipped_date) as daysleft
from orders
order by daysleft desc;