package com.rajat.libraryapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class BookController {
    

    @Autowired 
    BookService bookService;

    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return bookService.getAllBook();
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id ){
        Book book = bookService.getBookById(id);
        if (book == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(book);
    }

    @PostMapping("/book/add")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        String result = bookService.addBook(book);
        if (result == null) {
            return ResponseEntity.badRequest().body("Invalid book");
        }
        return ResponseEntity.ok(result);
    }

    @PutMapping("/book/{id}")
    public ResponseEntity<Book> updateBookById(@PathVariable int id, @RequestParam double newprice) {
        Book book = bookService.updateBookById(id, newprice);
    if (book == null) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(book);
}

    @DeleteMapping("/book/{id}")
    public ResponseEntity<String> deleteBookById(@PathVariable int id){

        boolean deleted = bookService.deleteBookById(id);

        if (deleted) {
            return ResponseEntity.ok("Book deleted successfully");
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/book/priceBelow/{price}")
    public List<Book> getBookPriceBelow (@PathVariable double price){
        return bookService.searchByPriceBelow(price);
    }

    @GetMapping("/book/author/{author}")
    public List<Book> getBookByAuthor (@PathVariable String author){
        return bookService.searchByAuthor(author);
    }

}
