package by.belhard.j24.SelfEducation.ClassesAndObjekts;

public class Counter {
    static int count;

    public static void invokeCounter(){
        count++;
        System.out.println("Текущее значение счётчика - " + count);
    }
}
