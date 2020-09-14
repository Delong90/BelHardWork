package by.belhard.j24.HomeWork.Self.Lesson05.Task03;

public class Circle extends CalculationUtils {
    private double radius;

    public Circle(double radius) {
        super("круг",3.141516*radius*radius,2*3.141516*radius);
        this.radius = radius;
    }


}
