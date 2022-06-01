package u.pankratova.service;

import org.springframework.stereotype.Service;
import u.pankratova.model.Buyer;
import u.pankratova.repository.BuyerRepository;

import java.util.List;

@Service
public class BuyerService {

    final BuyerRepository repository;

    public BuyerService(BuyerRepository repository) {
        this.repository = repository;
    }

    public void deleteById(int id){
        repository.deleteById(id);
    }

    public Buyer updateById(int id, Buyer buyer) {
        Buyer buyer1 = repository.findById(id);
        if ((buyer.getSurname() != null) && (!buyer.getSurname().equals("string")) ){
            buyer1.setSurname(buyer.getSurname());}
        if ((buyer.getLocation() != null) && (!buyer.getSurname().equals("string"))){
            buyer1.setLocation(buyer.getLocation());}
        if ((buyer.getDiscount() != 0)){
            buyer1.setDiscount(buyer.getDiscount());}
        return repository.save(buyer1);
    }

    public void add(Buyer buyer){
        repository.save(buyer);
    }

    public List<Buyer> getAllBuyers(){
      return repository.findAll();
    }

    public Buyer getBuyerById(int id){
        return repository.findById(id);
    }

    public void completeRewriteById(int id, Buyer buyer) {
        buyer.setId(id);
        repository.save(buyer);
    }

    // 2.2
    public List<Object> differentDistricts(){
        return repository.differentDistricts();
    }
}
