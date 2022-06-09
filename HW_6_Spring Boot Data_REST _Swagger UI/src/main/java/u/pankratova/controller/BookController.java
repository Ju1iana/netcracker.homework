package u.pankratova.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import u.pankratova.model.Book;
import u.pankratova.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Operation(summary = "Delete book by id")
    @ResponseStatus(code = HttpStatus.OK)
    @DeleteMapping("/deleteById{id}")
    public void deleteById(@RequestParam("id") int id){
        bookService.deleteById(id);
    }

    @Operation(summary = "Partial update by id")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @PatchMapping("/update")
    public void updateBook(@RequestParam("id") int id,
                           @RequestBody (required = false) Book book){
        bookService.updateById(id, book);
    }

    @Operation(summary = "Add a book")
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/add")
    public void addBook(@RequestBody Book book){
        bookService.add(book);
    }

    @Operation(summary = "Get all books")
    @ResponseStatus(code = HttpStatus.FOUND)
    @GetMapping("/getAll")
    public List<Book> getAllBooks(){
       return bookService.getAllBooks();
    }

    @Operation(summary = "Get book by id")
    @ResponseStatus(code = HttpStatus.FOUND)
    @GetMapping("/getById{id}")
    public Book getBookById(@RequestParam("id") int id) {
        return bookService.getBookById(id);
    }

    @Operation(summary = "Complete rewrite by id")
    @ResponseStatus(code = HttpStatus.OK)
    @PutMapping("/completeRewrite")
    public void rewriteBook(@RequestParam(value = "id") int id,
                            @RequestBody Book book){
        bookService.completeRewriteById(id, book);
    }

    // 2.1
    @Operation(summary = "Get all the different names and costs of the books")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/getAllNamesAndCosts")
    public List<Object> getAllNamesAndCosts(){
        return bookService.getAllNamesAndCosts();
    }

    // 3.3
    @Operation(summary = "Get books by name OR cost more than sum")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/nameOrCostMoreSum/{name}/{sum})")
    public List<String> nameAndCostMoreSum(@PathVariable(value = "name") String name,
                                           @PathVariable(value = "sum") double sum){
        return bookService.nameAndCostMoreSum(name, sum);
    }

    // 5.4
    @Operation(summary = "Data on the purchase of books and contained in stock more than ... pieces")
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/dataOfBooks{stuff}")
    public List<Object> dataOfBooks(@PathVariable(value = "stuff") int stuff){
        return bookService.dateOfBooks(stuff);
    }

}
