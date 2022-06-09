package u.pankratova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import u.pankratova.model.Book;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findById(int id);

    // 2.1
    @Query(value = "SELECT DISTINCT book_name, book_cost FROM books ORDER BY book_cost ASC", nativeQuery = true)
    List<Object> getAllNamesAndCosts();

    // 3.3
    @Query(value =
            "SELECT book_name, book_cost\n" +
            "FROM books\n" +
            "WHERE ((book_name LIKE %:name%) OR (book_cost > :sum))\n" +
            "ORDER BY book_name, book_cost", nativeQuery = true)
    List<String> nameAndCostMoreSum(@Param("name") String name, @Param("sum") double sum);

    // 5.4
    @Query(value =
            "SELECT bo.book_name, bo.book_warehouse, bo.book_quantity, bo.book_cost\n" +
            "FROM books bo JOIN orders o ON (o.order_book = bo.book_id)\n" +
            "              JOIN shops s ON (s.shop_id = o.order_seller)\n" +
            "WHERE\n" +
            "      bo.book_warehouse = s.shop_location AND\n" +
            "      bo.book_quantity > :stuff\n" +
            "ORDER BY bo.book_cost", nativeQuery = true)
    List<Object> dataOfBooks(@Param("stuff") int stuff);
}
