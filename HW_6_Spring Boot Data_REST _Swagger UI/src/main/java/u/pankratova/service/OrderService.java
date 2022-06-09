package u.pankratova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import u.pankratova.model.Book;
import u.pankratova.model.Buyer;
import u.pankratova.model.Order;
import u.pankratova.model.Shop;
import u.pankratova.repository.BookRepository;
import u.pankratova.repository.BuyerRepository;
import u.pankratova.repository.OrderRepository;
import u.pankratova.repository.ShopRepository;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BuyerRepository buyerRepository;

    @Autowired
    private ShopRepository shopRepository;

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public Order updateById(int id, Order order) {

        Order order1 = repository.findById(id);

        if ((order.getDate() != null) && (!order.getDate().equals("string"))) {
            order1.setDate(order.getDate());
        }
        if (order.getSeller() != 0) {
            order1.setSeller(order.getSeller());
        }
        if (order.getBuyer() != 0) {
            order1.setBuyer(order.getBuyer());
        }
        if (order.getBook() != 0) {
            order1.setBook(order.getBook());
        }
        if (order.getQuantity() != 0) {
            order1.setQuantity(order.getQuantity());
        }
        if (order.getSum() != 0) {
            order1.setSum(order.getSum());
        }

        return repository.save(order1);
    }

    public void add(Order order) {
        Book newBook = bookRepository.findById(order.getBook());
        Buyer newBuyer = buyerRepository.findById(order.getBuyer());
        Shop shop = shopRepository.findById(order.getSeller());

        newBook.setQuantity(newBook.getQuantity() - order.getQuantity()); // how many books are left

        order.setBuyer(order.getBuyer());
        order.setSeller(order.getSeller());

        order.setSum(

                (order.getQuantity() *
                        (1 + shop.getCommission() / 100d) *
                        (1 - newBuyer.getDiscount() / 100d) *
                        newBook.getCost())
        );

        repository.save(order);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order getOrderById(int id) {
        return repository.findById(id);
    }

    public void completeRewriteById(int id, Order order) {
        order.setId(id);
        repository.save(order);
    }

    // 2.3
    public List<String> differentMonths() {
        return repository.differentMonths();
    }

    // 4.1
    public List<Object> surnameBuyerAndShopName() {
        return repository.surnameBuyerAndShopName();
    }

    // 4.2
    public List<Object> dateSurnameDiscountNameAndQuantityOfBook() {
        return repository.dateSurnameDiscountNameAndQuantityOfBook();
    }

    // 5.1
    public List<Object> soldMoreThanSmth(double sum){
        return repository.soldMoreThanSmth(sum);
    }

    // 5.2
    public List<Object> earlierMonths(int months){
        return repository.earlierMonths(months);
    }
}
