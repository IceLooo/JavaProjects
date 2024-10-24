package kz.zhanayev.springcourse.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Book {
    private int id;

    @NotEmpty(message = "Название книги не должно быть пустым")
    @Size(min = 2 , max = 100, message = "Название книги должен содержать от 2 до 100 символов")
    private String title;

    @NotEmpty(message = "Автор не должен быть пустым")
    @Size(min = 2 , max = 100, message = "Имя автора должен содержать от 2 до 100 символов")
    private String author;

    @Min(value = 1500, message = "Книга должен быть больше,чем 1500")
    private int year;

    public Book() {}

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}