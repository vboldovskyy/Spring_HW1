package edu.cursor.spring_hw1.repository;

import edu.cursor.spring_hw1.entities.Book;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private List<Book> books = Arrays.asList(
            new Book(0,"Legioner","Drama","interesting book",4.9),
            new Book(1,"Kobzar","Drama","collection of verses",5.0)
    );

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void deleteBook(int idOfBook) {
        books.removeIf(book -> book.getId()==idOfBook);
    }

}
