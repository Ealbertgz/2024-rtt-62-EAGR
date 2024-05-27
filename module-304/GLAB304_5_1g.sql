select id,
date_format(shipped_date, '%W %D %M %Y') as 'shipped date'
from orders
order by shipped_date;