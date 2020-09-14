package by.belhard.j24.HomeWork.Self.Lesson05.Task01_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Author {

    private String nameAuthor;
    private String surNameAuthor;
    private int age;
    static int i;
    static String[] authors = new String[100];

    public Author(String nameAuthor, String surNameAuthor, int age) {
        this.nameAuthor = nameAuthor;
        this.surNameAuthor = surNameAuthor;
        if (age<3) {this.age = 3;}
        else { this.age = age;}
        authors[i] = nameAuthor+" "+surNameAuthor+" "+age;
        i++;


    }
    public Author() {
        if (nameAuthor==null){this.nameAuthor = "name unknown";}
        else{ this.nameAuthor = nameAuthor;}
        if (surNameAuthor==null){this.surNameAuthor = "name unknown";}
        else{ this.surNameAuthor = surNameAuthor;}
        if (age < 3) { this.age = 3; }
        else { this.age = age; }
        authors[i] = nameAuthor+" "+surNameAuthor+" "+age;
        i++;
    }

    public void array(){
        System.out.println(Arrays.toString(authors));
    }

    @Override
    public String toString() {
        return "Author{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", surNameAuthor='" + surNameAuthor + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getSurNameAuthor() {
        return surNameAuthor;
    }

    public void setSurNameAuthor(String surNameAuthor) {
        this.surNameAuthor = surNameAuthor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
