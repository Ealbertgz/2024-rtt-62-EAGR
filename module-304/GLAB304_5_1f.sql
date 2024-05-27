select
id,
date_format(order_date, '%Y-%m-%d') order_date,
date_format(required_date, '%a %D %b %Y') required_date,
date_format(shipped_date, '%W %D %M %Y') shipped_date
from orders;