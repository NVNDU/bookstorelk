package lk.bookstore.onlinebookshop.Service.ServiceImplenetation;

import lk.bookstore.onlinebookshop.Entity.Category;
import lk.bookstore.onlinebookshop.Repository.CategoryRepository;
import lk.bookstore.onlinebookshop.Service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(Long id) {
        return categoryRepository.findById(id).orElseThrow(()->new NoSuchElementException("Category is not found!"));
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id,Category category) {
        Category excategory = getById(id);
        excategory.setName(category.getName());
        excategory.setDesc(category.getDesc());
        return saveCategory(excategory);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
