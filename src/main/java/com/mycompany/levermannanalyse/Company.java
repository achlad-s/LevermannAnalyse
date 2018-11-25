package com.mycompany.levermannanalyse;

import java.io.Serializable;

public class Company implements Serializable {

    private Integer id;
    private String title;
    private String author;
    private String isbn;
    private Integer year;
    private Double price;

    public Company() {
    }

    public Company(String title, String author, String isbn, Integer year, Double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbnCode) {
        this.isbn = isbnCode;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbnCode='" + isbn + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}