package u.pankratova.service;

import org.springframework.stereotype.Service;
import u.pankratova.model.Book;
import u.pankratova.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void deleteById(int id) {
       repository.deleteById(id);
    }

    public Book updateById(int id, Book book) {

        Book book1 = repository.findById(id);

        if ((book.getName() != null) && (!book.getName().equals("string"))){
            book1.setName((book.getName()));}
        if (book.getCost() != 0){
            book1.setCost(book.getCost());}
        if ((book.getWarehouse() != null) && (!book.getName().equals("string"))){
            book1.setWarehouse(book.getWarehouse());}
        if (book.getQuantity() != 0){
            book1.setQuantity(book.getQuantity());}
        return repository.save(book1);
    }

    public void add(Book book){
        repository.save(book);
    }


    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book getBookById(int id) {
       return repository.findById(id);
    }

    public void completeRewriteById(int id, Book book) {
        book.setId(id);
        repository.save(book);
    }

    // 2.1
    public List<Object> getAllNamesAndCosts(){
        return repository.getAllNamesAndCosts();
    }

    // 3.3
    public List<Object> windowsOrPrice(){
        return repository.windowsOrPrice();
    }

    // 5.4
    public List<Object> dateOfBooks(){
        return repository.dataOfBooks();
    }


}
