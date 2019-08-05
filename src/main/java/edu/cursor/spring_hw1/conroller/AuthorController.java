package edu.cursor.spring_hw1.conroller;

import edu.cursor.spring_hw1.entities.Author;
import edu.cursor.spring_hw1.exceptions.UserNotFoundException;
import edu.cursor.spring_hw1.repository.AuthorRepository;
import edu.cursor.spring_hw1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("library")
public class AuthorController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/author")
    public String getAuthors() {
        return authorRepository.getAuthors().toString();
    }

    @GetMapping("/author/{id}")
    public Author getAuthor(@PathVariable Integer id) {
        if (id.compareTo(authorRepository.getAuthors().size()) >= 0) {
            throw new UserNotFoundException("user with id " + id + " not found");
        }
        return authorRepository.getAuthors().get(id);
    }

    @PostMapping("/author")
    public void createAuthor(@RequestBody Author author){
        authorRepository.addAuthor(author);
    }

    @DeleteMapping("/author/{id}")
    public void deleteAuthor(@PathVariable Integer id){
        authorRepository.deleteAuthor(id);
    }


}
