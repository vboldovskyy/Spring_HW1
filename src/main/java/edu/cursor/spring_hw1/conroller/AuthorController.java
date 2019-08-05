package edu.cursor.spring_hw1.conroller;

import edu.cursor.spring_hw1.entities.Author;
import edu.cursor.spring_hw1.entities.Book;
import edu.cursor.spring_hw1.exceptions.UserNotFoundException;
import edu.cursor.spring_hw1.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("library/author")
public class AuthorController {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public String getAuthors() {
        return authorRepository.getAuthors().toString();
    }

    @GetMapping("{id}")
    public Author getAuthor(@PathVariable Integer id) {
        if (id.compareTo(authorRepository.getAuthors().size()) >= 0) {
            throw new UserNotFoundException("author with id " + id + " not found");
        }
        return authorRepository.getAuthors().get(id);
    }

    @PostMapping
    public void createAuthor(@RequestBody Author author) {
        authorRepository.addAuthor(author);
    }

    @DeleteMapping("{id}")
    public void deleteAuthor(@PathVariable Integer id) {
        authorRepository.deleteAuthor(id);
    }

    @PutMapping("{id}")
    public void setAuthorBook(@PathVariable Integer id, @RequestBody Book book) {
        authorRepository.setBook(id, book);
    }
}
