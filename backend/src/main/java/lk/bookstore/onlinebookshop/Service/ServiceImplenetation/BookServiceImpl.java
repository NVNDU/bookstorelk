package lk.bookstore.onlinebookshop.Service.ServiceImplenetation;

import lk.bookstore.onlinebookshop.Entity.Book;
import lk.bookstore.onlinebookshop.Repository.BookRepository;
import lk.bookstore.onlinebookshop.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(()->new NoSuchElementException("Book is not found"));
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id,Book book) {
        Book exbook = getBookById(id);
        exbook.setIsbn(book.getIsbn());
        exbook.setName(book.getName());
        exbook.setDesc(book.getDesc());
        exbook.setPrice(book.getPrice());
        return saveBook(exbook);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
