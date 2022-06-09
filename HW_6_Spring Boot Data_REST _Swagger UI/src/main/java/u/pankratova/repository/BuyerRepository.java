package u.pankratova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import u.pankratova.model.Buyer;

import java.util.List;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

    Buyer findById(int id);

    void deleteById(int id);

    // 2.2
    @Query(value = "SELECT DISTINCT buyer_location FROM buyers", nativeQuery = true)
    List<String> differentDistricts();
}
