Select 
order_id,
order_line_number,
quantity_ordered * price_each AS subtotal
From orderdetails
Order by subtotal desc;
