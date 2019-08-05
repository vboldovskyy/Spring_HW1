package edu.cursor.spring_hw1.entities;

public class Author {
    private int id;
    private String name;
    private String surName;
    private Book book;

    public Author(int id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    public Author(int id, String name, String surName, Book book) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", book='" + book + '\'' +
                "}\n";
    }
}
