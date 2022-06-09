package u.pankratova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import u.pankratova.model.Shop;

import java.util.List;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

    Shop findById(int id);

    // 3.2
    @Query (value = "SELECT shop_name FROM shops WHERE ((shop_location LIKE :district1) OR (shop_location LIKE :district2))", nativeQuery = true)
    List<String> shopNames(@Param(value = "district1") String district1, @Param(value = "district2") String district2);

    // 5.3
    @Query (value =
            "SELECT DISTINCT s.shop_name, s.shop_location, b.buyer_surname, b.buyer_discount\n" +
            "FROM shops s, buyers b, orders o\n" +
            "WHERE o.order_buyer = b.buyer_id AND\n" +
            "      o.order_seller = s.shop_id AND\n" +
            "        s.shop_location NOT IN (:district) AND\n" +
            "        b.buyer_discount BETWEEN :from and :to", nativeQuery = true)
     List<Object> betweenFromAndTo(String district, int from, int to);
}
