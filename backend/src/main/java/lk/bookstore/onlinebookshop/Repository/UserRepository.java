package lk.bookstore.onlinebookshop.Repository;

import lk.bookstore.onlinebookshop.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
