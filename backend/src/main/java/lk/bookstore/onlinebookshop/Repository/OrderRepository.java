package lk.bookstore.onlinebookshop.Repository;

import lk.bookstore.onlinebookshop.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
