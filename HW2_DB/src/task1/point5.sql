CREATE TABLE new_t
(
    user_name text      NOT NULL,
    tstamp    timestamp NOT NULL,

    kt        integer   NOT NULL,
    nt        character varying(20),
    monthfee  numeric(12, 2),
    monthmins integer,
    minfee    numeric(12, 2)
);

-- Creating a trigger function
CREATE FUNCTION update_new_t()
    RETURNS trigger AS
$$
BEGIN
    INSERT INTO new_t
    SELECT session_user, now(), nt.*
    FROM new_table nt;
    RETURN NULL;
END
$$
LANGUAGE plpgsql;


-- Creating a trigger
CREATE trigger t_trigger
    AFTER update
    on public.t
    REFERENCING NEW TABLE AS
                    new_table
    FOR EACH STATEMENT EXECUTE PROCEDURE update_new_t();


-- Checking the trigger operation
UPDATE public.t
SET monthmins = 992
WHERE kt = 3;

UPDATE public.t
SET monthfee = 777
WHERE kt = 1;

UPDATE public.t
SET minfee = 654, monthfee = 5, monthmins = 22
WHERE kt = 3;

UPDATE public.t
SET minfee = 7
WHERE kt = 2;


-- Output of the updated table
SELECT * FROM new_t
GROUP BY kt, user_name, tstamp, nt, monthfee, monthmins, minfee;



/*
Output:

 user_name |           tstamp           | kt |   nt    | monthfee | monthmins | minfee
-----------+----------------------------+----+---------+----------+-----------+--------
 postgres  | 2022-05-20 22:15:01.432022 |  3 | Maxi    |     0.00 |       992 |   5.00
 postgres  | 2022-05-20 22:24:17.108426 |  1 | Mini    |   777.00 |       300 |   1.00
 postgres  | 2022-05-20 22:28:21.423592 |  3 | Maxi    |     5.00 |        22 | 654.00
 postgres  | 2022-05-20 22:29:00.01592  |  2 | Average |   200.00 |       150 |   7.00

*/