select order_id, sum(quantity_ordered) as qty,
	if(mod(sum(quantity_ordered),2), 'odd', 'even') as oddOrEven
from orderdetails
group by order_id
order by order_id

