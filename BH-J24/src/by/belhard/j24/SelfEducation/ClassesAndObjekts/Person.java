package by.belhard.j24.SelfEducation.ClassesAndObjekts;

public class Person {
    String name;
    int age;
    Country country;
    Sex Sex;

    void walk(){
        System.out.println("I'm walking");
    }
    void eat(String dish){
        System.out.println("I'm eating " + dish + ". Om-nom-nom!");
    }

    int growOld() {
        return ++age;
    }

    public String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    int getAge(){
        return age;
    }

    Country getCountry(){
        return country;
    }

    void setCountry(Country country){
        this.country = country;
    }

    Sex getSex(){
        return Sex;
    }

    public String toString(){
        return name + age + country + Sex;
    }

//    public void walk(){
//        System.out.println("I'm walking");
//    }

    public void walk(int minutes){
        System.out.println("I'm walking" + minutes + "int");
    }

    public void walk(String minutes){
        System.out.println("I'm walking" + minutes + "String");
    }







}
