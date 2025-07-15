package lk.bookstore.onlinebookshop.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column (columnDefinition = "TEXT", name = "description")
    private String desc;
}
