package com.rajat.libraryapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public String addBook(Book book) {
        if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
            return null;
        }
        if (book.getPrice() < 0) {
            return null;
        }
        bookRepository.save(book);
        return "Book Added: " + book.getTitle();

    }

    public Book getBookById(int id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        if (bookOptional.isPresent()) {
            return bookOptional.get();
        }
        return null;
    }

    public boolean deleteBookById(int id) {
        Optional<Book> bookOptional = bookRepository.findById(id);

        if (bookOptional.isPresent()) {
            bookRepository.deleteById(id);
            return true;
        }
        return false;

    }

    public Book updateBookById(int id, double newprice) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            book.setPrice(newprice);
            bookRepository.save(book);
            return book;
        }
        return null;
    }

   public List<Book> searchByAuthor(String author){
return bookRepository.findByAuthor(author);
   }

   public List<Book> searchByPriceBelow(double price){
    return bookRepository.findByPriceLessThan(price);
   }

}
