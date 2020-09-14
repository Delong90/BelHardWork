package by.belhard.j24.HomeWork.Self.Lesson05.Task03;

public class Square extends CalculationUtils {
    private double a;

    public Square(double a) {
        super("квадрат",a*a,4*a);
        this.a = a;
    }
}
