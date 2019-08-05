package edu.cursor.spring_hw1.conroller;

import edu.cursor.spring_hw1.entities.Book;
import edu.cursor.spring_hw1.exceptions.UserNotFoundException;
import edu.cursor.spring_hw1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("library")
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book")
    public String getAuthors() {
        return bookRepository.getBooks().toString();
    }

    @GetMapping("/book/sortByGenre/{genre}")
    public List<Book> getGenreSortedBooks(@PathVariable String genre){
        return bookRepository.getBooks().stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());
    }

    @GetMapping("/book/{id}")
    public Book getAuthor(@PathVariable Integer id) {
        if (id.compareTo(bookRepository.getBooks().size()) >= 0) {
            throw new UserNotFoundException("user with id " + id + " not found");
        }
        return bookRepository.getBooks().get(id);
    }

    @PostMapping("/book")
    public void createAuthor(@RequestBody Book book) {
        bookRepository.addBook(book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteAuthor(@PathVariable Integer id) {
        bookRepository.deleteBook(id);
    }
}
