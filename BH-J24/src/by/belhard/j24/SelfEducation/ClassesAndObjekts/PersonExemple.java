package by.belhard.j24.SelfEducation.ClassesAndObjekts;

public class PersonExemple {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.age = 25;
        p1.country = new Country();
            p1.country.title = "Belarus";
            p1.country.zipCode = 220040;
        p1.setName("JENIA");
        p1.Sex = Sex.MALE;

        Person p2 = new Person();

        p2.age = 30;
        p2.country = new Country();
        p2.country.title = p1.country.title;
        p2.country.zipCode = p1.country.zipCode;
        p2.name = "DIMA";
        p2.Sex = Sex.MALE;


        System.out.println("I'm " + p1.getName() + ". ");
        p2.eat("milk");

        System.out.println("I'm " + p2.name + ". ");
        p2.eat("bear");

        System.out.println(p1.getAge());
        System.out.println(p2.getAge());

        System.out.println(p1);
        System.out.println(p2);


        p1.walk(5);
        p1.walk("two");

    }
}
