package u.pankratova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import u.pankratova.model.Order;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    Order findById(int id);

    // 2.3
    @Query(value = "select distinct to_char(order_date, 'Month') from orders", nativeQuery = true)
    List<String> differentMonths();

    // 4.1
    @Query(value =
            "SELECT b.buyer_surname, s.shop_name\n" +
                    "FROM orders o JOIN buyers b ON (o.order_buyer = b.buyer_id)\n" +
                    "              JOIN shops s ON (o.order_seller = s.shop_id)", nativeQuery = true)
    List<Object> surnameBuyerAndShopName();

    // 4.2
    @Query(value =
            "SELECT o.order_date, b.buyer_surname, b.buyer_discount, boo.book_name, o.order_quantity\n" +
                    "       FROM orders o JOIN books boo ON (o.order_book = boo.book_id)\n" +
                    "                     JOIN buyers b ON (o.order_buyer = b.buyer_id)", nativeQuery = true)
    List<Object> dateSurnameDiscountNameAndQuantityOfBook();

    // 5.1
    @Query(value =
            "SELECT o.order_id, b.buyer_surname, o.order_date\n" +
                    "FROM orders o JOIN buyers b ON (b.buyer_id = o.order_buyer)\n" +
                    "WHERE o.order_sum >= :sum", nativeQuery = true)
    List<Object> soldMoreThanSmth(@Param(value = "sum") double sum);

    // 5.2
    @Query(value =
            "SELECT b.buyer_surname , b.buyer_location , o.order_date\n" +
            "        FROM orders o, buyers b, shops s\n" +
            "            WHERE o.order_buyer = b.buyer_id\n" +
            "                AND o.order_seller = s.shop_id\n" +
            "                AND s.shop_location = b.buyer_location\n" +
            "                AND EXTRACT(MONTH FROM o.order_date) < :months\n" +
            "        ORDER BY o.order_date", nativeQuery = true)
    List<Object> earlierMonths(@Param(value = "months") int months);
}


