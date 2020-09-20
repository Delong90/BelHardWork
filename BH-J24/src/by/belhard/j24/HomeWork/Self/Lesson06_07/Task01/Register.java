package by.belhard.j24.HomeWork.Self.Lesson06_07.Task01;
import java.util.ArrayList;
import java.util.List;

public class Register{
    private List<Person> persons = new ArrayList<>();

    public Register(){
        Person person1 = new Person("Vasia");
        Person person2 = new Person("Kolia");
        Person person3 = new Person("Liza");
        Person person4 = new Person("Sveta");
        Person person5 = new Person("Dima");
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
    }



    public Person Search(String name) {
        Person result = new Person();
        for (Person x : persons) {
            if (x.getName().equals(name)) {
                result = x; break;
            }
                    }
        return result;

    }

    @Override
    public String toString() {
        return "Register{" +
                "persons=" + persons +
                '}';
    }
}
