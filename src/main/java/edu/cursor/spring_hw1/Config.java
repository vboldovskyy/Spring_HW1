package edu.cursor.spring_hw1;

import edu.cursor.spring_hw1.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    //@Qualifier("AuthorRepositoryImpl")
    private final AuthorRepository authorRepository;

    @Autowired
    public Config(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
