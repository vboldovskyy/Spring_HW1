package edu.cursor.spring_hw1.entities;

public class Book {
    private int id;
    private String title;
    private String ganre;
    private String description;
    private double rating;

    public Book(int id, String title, String ganre, String description, double rating) {
        this.id = id;
        this.title = title;
        this.ganre = ganre;
        this.description = description;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGanre() {
        return ganre;
    }

    public void setGanre(String ganre) {
        this.ganre = ganre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", ganre='" + ganre + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                "}\n";
    }
}
