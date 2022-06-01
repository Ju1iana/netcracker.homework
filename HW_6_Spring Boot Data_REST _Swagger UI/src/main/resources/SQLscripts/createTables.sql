CREATE TABLE shops
(
    shop_id         serial CONSTRAINT shop_id PRIMARY KEY,
    shop_name       varchar(30) NOT NULL,
    shop_location   varchar(50) NOT NULL,
    shop_commission integer
);

CREATE TABLE buyers
(
    buyer_id       serial CONSTRAINT buyer_id PRIMARY KEY,
    buyer_surname  varchar(25) NOT NULL,
    buyer_location varchar(50) NOT NULL,
    buyer_discount integer
);

CREATE TABLE books
(
    book_id        serial CONSTRAINT book_id PRIMARY KEY,
    book_name      varchar(40)   NOT NULL,
    book_cost      bigint, /*CHECK (book_cost > 0),*/
    book_warehouse varchar(30)   NOT NULL,
    book_quantity  integer
);

CREATE TABLE orders
(
    order_id       serial CONSTRAINT order_id PRIMARY KEY,
    order_date     date,
    order_seller   integer NOT NULL,
    order_buyer    integer NOT NULL,
    order_book     integer NOT NULL,
    order_quantity integer NOT NULL,
    order_sum      bigint,

    FOREIGN KEY (order_seller) REFERENCES shops (shop_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (order_buyer) REFERENCES buyers (buyer_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (order_book) REFERENCES books (book_id) ON DELETE CASCADE ON UPDATE CASCADE
);
