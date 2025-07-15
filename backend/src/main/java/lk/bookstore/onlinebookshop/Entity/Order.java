package lk.bookstore.onlinebookshop.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String item;

    @Column
    private Double unitPrice;

    @Column(columnDefinition = "INT DEFAULT 1")
    private int qty;

    @Column
    private Double Discount;

    @Column
    private Double total;

}
