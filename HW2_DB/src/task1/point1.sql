
/* adding duplicates */
INSERT INTO s VALUES (3334, 'Petr', 'Petrov', 3, 'm', 170, 1200.00);
INSERT INTO s VALUES (2221, 'Steven', 'King', 3, 'm', 193, 4999.00);
INSERT INTO s VALUES (6666, 'Lee', 'Evans', 3, 'm', 300, 0.00);
INSERT INTO s VALUES (1009, 'Gary', 'G', 2, 'm', 160, 9800.00); --this is not a duplicate, he has a different surname
INSERT INTO s VALUES (1267, 'Ivan', 'Ivanov', 1, 'm', 190, 1.00);
INSERT INTO s VALUES (1033, 'Chris', 'Tucker', 2, 'm', 190, 900.00);
INSERT INTO s VALUES (1011, 'Luke', 'Perry', 3, 'm', 167, 950.00);

/* show duplicates */
SELECT sfn, sln
FROM s
GROUP BY sfn, sln
HAVING (COUNT(*) > 1)

/*
Output:

  sfn   |  sln
--------+--------
 Steven | King
 Luke   | Perry
 Petr   | Petrov
 Ivan   | Ivanov
 Chris  | Tucker
 Lee    | Evans

*/