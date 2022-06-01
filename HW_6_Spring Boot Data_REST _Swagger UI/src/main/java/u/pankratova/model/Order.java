package u.pankratova.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private int id;

    @Column(name = "order_date")
    private Date date;

    @Column(name = "order_seller", nullable = false)
    private int seller;

    @Column(name = "order_buyer", nullable = false)
    private int buyer;

    @Column(name = "order_book", nullable = false)
    private int book;

    @Column(name = "order_quantity", nullable = false)
    private int quantity;

    @Column(name = "order_sum", nullable = false)
    private double sum;
}
