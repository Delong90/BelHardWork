package by.belhard.j24.HomeWork.Class.Lesson05.task01_1;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("", 20, BookFormat.A3, "", "");
        Book bookNull = new Book(null, 20, BookFormat.A3, null);

        System.out.println(book1);
        System.out.println(bookNull);
    }
}
