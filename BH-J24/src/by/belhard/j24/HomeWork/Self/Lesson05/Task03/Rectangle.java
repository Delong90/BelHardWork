package by.belhard.j24.HomeWork.Self.Lesson05.Task03;

public class Rectangle  extends CalculationUtils {
    private double b;
    private double c;



    public Rectangle(double b, double c) {
        super("прямоугольник",b*c,2*b+2*c);
        this.b = b;
        this.c = c;
    }
}
