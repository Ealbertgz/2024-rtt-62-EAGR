select product_id,
round (avg(quantity_ordered * price_each)) as avg_order_item_value 
from orderdetails
group by product_id;