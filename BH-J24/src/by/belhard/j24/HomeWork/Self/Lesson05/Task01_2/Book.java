package by.belhard.j24.HomeWork.Self.Lesson05.Task01_2;

import java.util.Arrays;

public class Book extends Author {
    private String nameBook;
    private int numberOfPages;
    private String format;



    public Book(String nameAuthor, String surNameAuthor, int age, String nameBook, int numberOfPages, String format) {
        super(nameAuthor, surNameAuthor, age);
        this.nameBook = nameBook;
        if (numberOfPages<3) {this.numberOfPages = 3;}
        else { this.numberOfPages = numberOfPages;}
        this.format = format;

    }
    public Book() {
        super();
        if (nameBook==null){this.nameBook = "name unknown";}
        else{ this.nameBook = nameBook;}
        if (numberOfPages < 3) {this.numberOfPages = 3;}
        else {this.numberOfPages = numberOfPages;}
        this.format = format;


    }





    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "nameBook='" + nameBook + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", format='" + format + '\'' +
                '}';
    }


    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }




}
