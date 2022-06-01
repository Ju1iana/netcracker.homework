package u.pankratova.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "buyers")
@Data
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buyer_id", nullable = false)
    private int id;

    @Column(name = "buyer_surname", nullable = false)
    private String surname;

    @Column(name = "buyer_location", nullable = false)
    private String location;

    @Column(name = "buyer_discount", nullable = false)
    private int discount;
}
