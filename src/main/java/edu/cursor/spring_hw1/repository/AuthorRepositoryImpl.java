package edu.cursor.spring_hw1.repository;

import edu.cursor.spring_hw1.entities.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {

    private List<Author> authors= new ArrayList<>();
    @Override
    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public void deleteAuthor(int idOfAuthor) {
        authors.removeIf(author -> author.getId()==idOfAuthor);
    }
}


/*
Arrays.asList(
        new Author(1,"Luize", "Rivera"),
        new Author(2,"Taras", "Shevchenko")
        );*/
