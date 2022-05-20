
/* creating a procedure containing a cursor */

CREATE OR REPLACE PROCEDURE public.dev_correct_salary(
)
    LANGUAGE 'plpgsql'
AS $BODY$
DECLARE
    rec RECORD;
    cur CURSOR FOR SELECT * FROM s WHERE salary < 50;
BEGIN
    OPEN cur;
    LOOP
        FETCH cur INTO rec;
        IF NOT FOUND THEN
            EXIT;
        END IF;
        rec.salary = 50;
        UPDATE s SET salary = rec.salary WHERE CURRENT OF cur;
    END LOOP;
END;
$BODY$;


/* call */

CALL dev_correct_salary();

SELECT * FROM s;
SELECT * FROM s WHERE salary = 50;

/*

Output:

  ks  |  sfn   |   sln    | kt | gender |  h  | salary
------+--------+----------+----+--------+-----+---------
 1002 | Ian    | Holm     |  2 | m      | 169 | 1200.00
 1003 | Milla  | Jovovich |  2 | f      | 176 | 2100.00
 1004 | Chris  | Tucker   |  2 | m      | 190 |  900.00
 1005 | Luke   | Perry    |  3 | m      | 167 |  950.00
 1006 | Brion  | James    |  3 | m      | 200 | 1100.00
 1007 | Lee    | Evans    |  3 | m      | 178 |  500.00
 1001 | Gary   | Oldman   |  1 | m      | 167 | 2500.00
 1234 | Ivan   | Ivanov   |  3 | m      | 199 |  501.00
 2222 | Steven | King     |  3 | m      | 193 | 4999.00
 1100 | Grette | Tundberg |  1 | f      | 149 | 3899.00
 1009 | Gary   | G        |  2 | m      | 160 | 9800.00
 6666 | Lee    | Evans    |  3 | m      | 300 |   50.00
 1267 | Ivan   | Ivanov   |  1 | m      | 190 |   50.00
 3334 | Petr   | Petrov   |  3 | m      | 170 | 1200.00
 2221 | Steven | King     |  3 | m      | 193 | 4999.00
 1033 | Chris  | Tucker   |  2 | m      | 190 |  900.00
 1011 | Luke   | Perry    |  3 | m      | 167 |  950.00
 3333 | Petr   | Petrov   |  3 | m      | 170 | 1200.00


           ----- the salary is only 50 -----

  ks  | sfn  |  sln   | kt | gender |  h  | salary
------+------+--------+----+--------+-----+--------
 6666 | Lee  | Evans  |  3 | m      | 300 |  50.00
 1267 | Ivan | Ivanov |  1 | m      | 190 |  50.00


*/