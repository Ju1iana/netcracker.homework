/* adding duplicates */

INSERT INTO f VALUES (120026, 1002, '2021-11-11 11:35:35.688+03', 4);
INSERT INTO f VALUES (120099, 1005, '2018-01-08 08:35:35.000+00', 54);
INSERT INTO f VALUES (120098, 1004, '2021-11-11 11:35:35.000+00', 1);
INSERT INTO f VALUES (120097, 1004, '2021-11-11 11:45:35.000+00', 189);


/* our situation is when the duration of the call > 30 minutes,
   and the previous call of this subscriber < 5 minutes */

SELECT *
FROM f first
        INNER JOIN f second ON second.ks = first .ks
WHERE (first.dur > 30 AND second.dur < 5) AND
      (second.dt = (SELECT MAX(max.dt)
        FROM f AS max WHERE max.ks = first.ks AND max.dt < first.dt));


/*

Output:

 idcall |  ks  |             dt             | dur | idcall |  ks  |             dt             | dur
--------+------+----------------------------+-----+--------+------+----------------------------+-----
 120027 | 1002 | 2021-11-12 11:35:35.688+03 | 100 | 120026 | 1002 | 2021-11-11 11:35:35.688+03 |   4
 120099 | 1005 | 2018-01-08 11:35:35+03     |  54 | 120015 | 1005 | 2018-01-08 11:00:00+03     |   3
 120097 | 1004 | 2021-11-11 14:45:35+03     | 189 | 120098 | 1004 | 2021-11-11 14:35:35+03     |   1

*/

