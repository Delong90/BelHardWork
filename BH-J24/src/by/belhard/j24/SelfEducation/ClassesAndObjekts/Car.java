package by.belhard.j24.SelfEducation.ClassesAndObjekts;


public class Car {
    public static void main(String[] args){

        ColorCar redCar = new ColorCar();
        ColorCar blueCar = new ColorCar();

        redCar.color = 156;
        blueCar.color = 35;

        System.out.println(redCar.color);
        System.out.println(blueCar.color);

        Counter.invokeCounter();
        Counter.invokeCounter();
        Counter.invokeCounter();

    }
}
