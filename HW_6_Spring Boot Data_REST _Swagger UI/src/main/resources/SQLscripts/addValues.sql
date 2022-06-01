INSERT INTO books (book_name, book_cost, book_warehouse, book_quantity)
VALUES
       ('Morphine', 11000, 'Moskovsky', 30660),
       ('The Metamorphosis', 1780, 'Kanavinsky', 124),
       ('Les Misérables - tome one', 28000, 'Avtozavodsky', 3450),
       ('Les Misérables - tome two', 31000, 'Avtozavodsky', 7021),
       ('Notre-Dame de Paris', 21000, 'Sormovsky', 1400),
       ('The Man Who Laughs', 7000, 'Moskovsky', 741),
       ('The Last Day of a Condemned Man', 6400, 'Nizhegorodsky', 666),
       ('The Great Gatsby', 7777, 'Sormovsky', 777),
       ('WindowsXP', 1, 'Sovetsky', 89),
       ('The Kite Runner', 1451, 'Nizhegorodsky', 30400),
       ('War and Peace', 29000, 'Avtozavodsky', 10000),
       ('Hamlet', 4500, 'Kanavinsky', 654),
       ('Lolita', 1000, 'Avtozavodsky', 20000),
       ('Anna Karenina', 2315, 'Moskovsky', 8956),
       ('The House of Asterion', 14, 'Nizhegorodsky', 14),
       ('Some Windows', 74, 'Sormovsky', 134),
       ('The Old Man and the Sea', 1504, 'Sovetsky', 457),
       ('Windows10', 1024, 'Avtozavodsky', 2048),
       ('Camera Obscura', 660, 'Nizhegorodsky', 130),
       ('Microsoft Windows Vista', 4501, 'Nizhegorodsky', 954),
       ('Frankenstein', 6120, 'Sormovsky', 1477),
       ('Mein Kampf (Main Camp)', 99999, 'Leninsky', 4),
       ('Faust', 26666, 'Sormovsky', 6600),
       ('The Master and Margarita', 29644, 'Nizhegorodsky', 45000),
       ('The Little Prince', 40000, 'Nizhegorodsky', 10100),
       ('The Count of Monte Cristo', 21015, 'Leninsky', 34504),
       ('WindowsNT', 1500, 'Moskovsky', 45);


INSERT INTO buyers (buyer_surname, buyer_location, buyer_discount)
VALUES
      ('Smith', 'Moskovsky', 5),
      ('Jones', 'Sovetsky', 15),
      ('Williams', 'Nizhegorodsky', 20),
      ('Taylor', 'Sormovsky', 3),
      ('Davies', 'Avtozavodsky', 15),
      ('Evans', 'Avtozavodsky', 5),
      ('Davies', 'Moskovsky', 20),
      ('Wilson', 'Sormovsky', 15),
      ('Roberts', 'Nizhegorodsky', 25),
      ('Lewis', 'Nizhegorodsky', 4),
      ('Wood', 'Avtozavodsky', 40),
      ('Thompson', 'Sormovsky', 15),
      ('White', 'Sovetsky', 10),
      ('Lolo', 'Nizhegorodsky', 12),
      ('Watson', 'Leninsky', 15);


INSERT INTO shops (shop_name, shop_location, shop_commission)
VALUES
      ('Shop1' ,'Sormovsky',5),
      ('Shop2' ,'Sormovsky',15),
      ('Shop4' ,'Leninsky',10),
      ('Shop11' ,'Nizhegorodsky',11),
      ('Shop77' ,'Avtozavodsky',4),
      ('Shop78' ,'Sovetsky',21),
      ('Shop3' ,'Avtozavodsky',20),
      ('Shop55' ,'Leninsky',11),
      ('Shop6' ,'Nizhegorodsky',5);

INSERT INTO orders (order_date, order_seller, order_buyer,
                    order_book, order_quantity, order_sum)
VALUES
     ('10-11-2022', 1, 4, 5, 1, 20000),
     ('07-08-2022', 2, 1, 1, 1, 60660),
     ('28-04-2022', 3, 1, 2, 1, 124),
     ('17-08-2022', 2, 8, 8, 2, 32000),
     ('01-12-2022', 4, 4, 10, 5, 58400),
     ('20-07-2022', 1, 5, 7, 1, 1244),
     ('20-09-2022', 2, 6, 8, 2, 72800),
     ('02-02-2022', 5, 7, 9, 1, 3500),
     ('19-01-2022', 3, 8, 12, 1, 700),
     ('19-01-2022', 1, 3, 4, 5, 2400),
     ('19-01-2022', 2, 10, 16, 3, 8400),
     ('19-01-2022', 4, 11, 7, 6, 400),
     ('19-01-2022', 4, 14, 8, 2, 7120),
     ('19-01-2022', 1, 13, 10, 1, 1000),
     ('10-03-2022', 3, 9, 11, 1, 9000);
