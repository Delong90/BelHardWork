package by.belhard.j24.HomeWork.Self.Lesson06_07.Task01;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
