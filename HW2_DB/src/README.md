SQL task on PostgreSQL
---
---
      Task to work with the database:

1.	Duplicates were mistakenly entered into the subscribers table (customers – “s”). Find them.
      (by first and last name)
2.	Find a situation in which the duration of the call exceeds 30 minutes, and the call of this subscriber immediately preceding it is less than 5 minutes.
3.	Calculate how much the average duration of subscribers' calls differs from the average for the tariff to which this subscriber is connected, and the total average duration of the call. Make two options – using the analytical function and without using it.
4.  The table of subscribers contains their salary. Using the procedure containing the cursor, adjust the salary: if less than 50 – set 50.
5.  Create a trigger for logging changes in tariffs.

For testing, it is necessary to prepare and show the appropriate test data set.

      Design assignment:
It is required to design a database according to the above requirements.
The answer should be an SQL script.

Designing the database of distributed IT development company.
Entities:

1)	Location
      * Office of the company.
      * The office hires employees (programmers, developers, testers, etc.) who sign a contract there, work there geographically and receive a salary.
      * The office is identified by name (‘Moscow’, ‘New York’ etc.).
2)	Employee
      * Employee works for company.
      * Employee identifies by employee_code.
      * ‘Employee’ entity has usual attributes (first and last names etc.).
3)	Team
      * A team is a group of employees United to perform work in projects.
      * A team may be distributed.
      * The team is identified by team_code assigned in the company.
4)	Customer
      * A customer is the counterparty to the project (one or many).
      * The customer is identified by the set code.
      * It has information details.
5)	Project
      * A project is a unit of management.
      * The project corresponds to one Customizer, it has cost and deadline.
      * The project is assigned to one and only one team.
