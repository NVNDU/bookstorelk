package lk.bookstore.onlinebookshop.Repository;

import lk.bookstore.onlinebookshop.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
