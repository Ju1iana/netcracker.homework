package u.pankratova.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private int id;

    @Column(name = "book_name", nullable = false)
    private String name;

    @Column(name = "book_cost", nullable = false)
    private double cost;

    @Column(name = "book_warehouse", nullable = false)
    private String warehouse;

    @Column(name = "book_quantity", nullable = false)
    private int quantity;
}
