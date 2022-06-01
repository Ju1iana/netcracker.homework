package u.pankratova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import u.pankratova.model.Shop;

import java.util.List;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

    Shop findById(int id);

    // 3.2
    @Query (value = "SELECT shop_name FROM shops WHERE ((shop_location LIKE 'Sovetsky') OR (shop_location LIKE 'Sormovsky'))", nativeQuery = true)
    List<Object> shopNames();

    @Query (value =
            "SELECT DISTINCT s.shop_name, s.shop_location, b.buyer_surname, b.buyer_discount\n" +
            "FROM shops s, buyers b, orders o\n" +
            "WHERE o.order_buyer = b.buyer_id AND\n" +
            "      o.order_seller = s.shop_id AND\n" +
            "        s.shop_location NOT LIKE 'Avtozavodsky' AND\n" +
            "        b.buyer_discount BETWEEN 10 and 15", nativeQuery = true)
    public List<Object> between10and15();
}
