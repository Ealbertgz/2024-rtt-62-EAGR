select customer_name, country, credit_limit
from customers
where (country = 'usa' or country ='france') and
credit_limit > 100000;