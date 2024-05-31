-- homework 1

-- question 0
-- I want to see the count o the number of products in each product line
select * from productlines;
select * from products where producline_id = 1;

select pl.product_line, count(*)
from products p, productlines pl
where p.productline_id = pl.id
group by pl.id;

-- question A
-- I want to see a list of employees and all of the customers for that employee. Employee name will be duplicated in the result set. I want to see the employee first and last name and the customer contact first and last name as well as the customer name
select * from employees;
select * from customers;

select e.id as employee_id, e.firstname, e.lastname, c.customer_name, c.contact_firstname, c.contact_lastname
from employees e, customers c
where c.sales_rep_employee_id = e.id
order by e.id;
-- question B
-- I want to see a list of employees in each office. Show the office name and the employee name
-- here again the office and the employee have a 1 to many relationship -- 1 office has many employees
-- thus the office name repeats in the result set

select * from offices;
select * from employees;

select o.city, e.firstname, e.lastname
from offices o, employees e
where o.id = e.office_id
order by o.city;

-- Question 
-- I want to see the total number of each employee type based on job title... result should be the job title and the number of employees with that job title.alter

select * from employees;
select job_title, count(*) from employees group by job_title order by job_title;

-- Question
-- I want to see a list of all payments each customer has made. Order the list by customer name ascendind, then by the payment amount descending
select * from payments;
select * from customers;

select c.customer_name, p.amount
from customers c, payments p
where p.customer_id = c.id
order by c.customer_name asc, p.amount desc;

-- question
-- I want to see a list of products that have never been sold..use..where not in ( select product_id from order_details) in your where clause

select * from products where id not in( select distinct product_id from orderdetails);

-- question
-- are there any customers that have never made an order
select * from orders;
select * from customers where id not in (select customer_id from orders);


-- Question 1
-- how many customers are handled by each office. I want to see the office name and the count of the number of customers in that office

select * from offices;

select o.id, o.city, count(*) 
from offices o, employees e, customers c
where o.id = e.office_id
	and e.id = c.sales_rep_employee_id
group by o.id
order by o.city;


-- this was an intermediate query that we used to build our final query and it can help us 

 -- actual final query that solves the business need
 
 
-- question 2
-- I want to see the products with the most margin at the top of the table. Inlcude the product name, buy price, msrp, and margin the results. Margin is calculated by (MSRP - buy_price)

select * from products;
select product_name, buy_price, msrp, (msrp - buy_price) as margin 
from products
order by margin desc;

-- question 2.5
-- I want to see the top  5 customers in each state based on margin

-- question 3
-- I want to see the top 5 salesmen in the company based on the total amount sold

-- question 4
-- I want to see the top 5 salesmen based on overall profit (margin)

-- question 5
-- I want to see all of the orders that happened in 2004. You can use a function called year(order_date) = 2004

select * from orders
where year(order_date) = 2004;

-- question 6
-- I want to see the total amount of all orders grouped by the year

select * from orders;
select * from orderdetails;

select year(o.order_date), sum(od.quantity_ordered * price_each) as total_amount
from orders o, orderdetails od
where o.id = od.order_id
group by year(o.order_date);

-- question 7
-- I want to see the top 5 products based on quantity sold accross all orders

select * from orderdetails;

select product_name, sum( quantity_ordered) as total_ordered
from products p, orderdetails od
where od.product_id = p.id
group by od.product_id
order by total_ordered desc
limit 5;

-- question 7.5
-- how many times has each product appear in an order regardless of how many were purchased

select p.product_name, count(p.id) as cnt
from orderdetails od, products p
where od.product_id = p.id
group by p.id
order by cnt desc;

-- we can validate our results with
-- select * from order_details where product_id = 40;

-- question 7.6
-- how many products would be out of stock based on the amount sold across them -- not sure if the data will support this...basically looking for the sum of the quantity for any product where the sum of the quantity sold is greater than the quantity in stock

-- question 7.9
-- I want to see the distinct order status ordered alphabetically

-- question 8
-- I want to see the office name and the distinct product lines and the product lines that have been sold in that office. this will require joining almost all of the tables.
select distinct o.name as office_name, pl.name as product_line_name ...

