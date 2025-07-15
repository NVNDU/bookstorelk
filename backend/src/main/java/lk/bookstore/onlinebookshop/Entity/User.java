package lk.bookstore.onlinebookshop.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(nullable = false, name = "password")
    private String pwd;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, name = "phone_number")
    private int pno;

}
