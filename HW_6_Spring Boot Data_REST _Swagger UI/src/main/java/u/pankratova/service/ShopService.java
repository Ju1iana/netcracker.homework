package u.pankratova.service;

import org.springframework.stereotype.Service;
import u.pankratova.model.Shop;
import u.pankratova.repository.ShopRepository;

import java.util.List;

@Service
public class ShopService {

    private final ShopRepository repository;

    public ShopService(ShopRepository repository) {
        this.repository = repository;
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public void updateById(int id, Shop shop) {

        Shop shop1 = repository.findById(id);

        if ((shop.getName() != null) && (!shop.getName().equals("string"))) {
            shop1.setName(shop.getName());
        }
        if ((shop.getLocation() != null) && (!shop.getLocation().equals("string"))) {
            shop1.setLocation(shop.getLocation());
        }
        if (shop.getCommission() != 0) {
            shop1.setCommission(shop.getCommission());
        }

        repository.save(shop1);
    }

    public void add(Shop shop) {
        repository.save(shop);
    }

    public List<Shop> getAllShops() {
        return repository.findAll();
    }


    public Shop getShopById(int id) {
        return repository.findById(id);
    }

    public void completeRewriteById(int id, Shop shop) {
        shop.setId(id);
        repository.save(shop);
    }

    // 3.2
    public List<Object> shopNames(){
        return repository.shopNames();
    }

    // 5.3
    public List<Object> between10and15(){
        return repository.between10and15();
    }

}
