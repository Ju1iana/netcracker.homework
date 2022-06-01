Spring Boot Data + REST + Swagger UI
---
Create and fill in the specified tables using one of the DBMS. For example, PostgreSQL. Come up with test data for the tables yourself. Choose the data type yourself.
---

1. Buyer

| buyer_id | buyer_surname | buyer_location | buyer_discount |
|:--------:|:-------------:|:--------------:|:--------------:|

2. Shops

| shop_id | shop_name | shop_location | shop_commission |
|:-------:|:---------:|:-------------:|:---------------:|

3. Books

| book_id | book_name | book_cost | book_warehouse | book_quantity |
|:-------:|:---------:|:---------:|:--------------:|:-------------:|

4. Orders

| order_id | order_date | order_seller | order_buyer | order_book | order_quantity | order_sum |
|:--------:|:----------:|:------------:|:-----------:|:----------:|:--------------:|:---------:|


---
**Using the Spring Boot framework to implement a Java application that provides the following REST API:**

**1. Implement basic CRUD operations. For each of the tables, it is necessary to provide the possibility of** 

* deleting by id (DELETE method)
* partial updating by id (PATCH method)
* adding (POST method)
* output of all records (GET method) 
* object request by id (GET method)
* complete rewriting by id (PUT method)

        some comment: order–data must be entered in a special way (XXXX-XX-XX – meaning – year, month, date)

**2. Create queries to output:**
* all the different titles and values of books;
* all the different areas where buyers live;
* all the different months when purchases were made

**3. Create requests for information about:**
* the surnames and the amount of the discount of all buyers living in the Nizhny Novgorod region;
* the names of stores in Sormovsky or Sovetsky districts;
* The names and cost of books in which the word Windows occurs, or worth more than 20,000 rubles. The output of the results is organized by the name and descending prices of books.

**4. For each purchase, output the following data:**
* the name of the buyer and the name of the store where the purchase was made;
* date, last name of the buyer, discount, title and number of books purchased.

**5. Define:**
* the order number, the buyer's surname and the date for purchases in which books worth at least 60,000 rubles were sold
* purchases made by the buyer in his area no earlier than March. Print the buyer's last name, district, date. Perform sorting;
* stores located in any area, except Avtozavodsky, where those who have a discount from 10 to 15 bought books %;
* data on the purchase of books (name, storage area, quantity) purchased in the storage area and contained in stock more than 10 pieces. Include the cost data and sort it in ascending order.

---

    don't forget to change the password in the database
---
   
   
![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW_6_Spring%20Boot%20Data_REST%20_Swagger%20UI/src/main/resources/swagger_images/sw_1.png)

ShopController
---
![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW_6_Spring%20Boot%20Data_REST%20_Swagger%20UI/src/main/resources/swagger_images/sw_2.png)

OrderController
---
![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW_6_Spring%20Boot%20Data_REST%20_Swagger%20UI/src/main/resources/swagger_images/sw_3.png)

BuyerController
---
![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW_6_Spring%20Boot%20Data_REST%20_Swagger%20UI/src/main/resources/swagger_images/sw_4.png)

BookController
---
![](https://github.com/Ju1iana/netcracker.homework/blob/main/HW_6_Spring%20Boot%20Data_REST%20_Swagger%20UI/src/main/resources/swagger_images/sw_5.png)
