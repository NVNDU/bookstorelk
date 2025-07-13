package lk.bookstore.onlinebookshop.Entity;

import jakarta.persistence.*;

@Entity(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String ISBN;

    @Column(nullable = false, name = "book_name")
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String desc;

    @Column(nullable = false)
    private Double price;
}
