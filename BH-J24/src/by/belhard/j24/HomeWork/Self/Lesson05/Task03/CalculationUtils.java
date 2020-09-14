package by.belhard.j24.HomeWork.Self.Lesson05.Task03;

public class CalculationUtils {
    private double S;
    private double P;
    private String figura;

    public CalculationUtils(String figura,double s, double p) {
        this.S = s;
        this.P = p;
        this.figura = figura;
    }

    public void Out(){
        System.out.println("Тип фигуры: " +getFigura());
        System.out.println("Площадь фигуры: " +getS());
        System.out.println("Периметр фигуры: " +getP());
        System.out.println();
    }

    public double getS() {
        return S;
    }

    public double getP() {
        return P;
    }

    public String getFigura() {
        return figura;
    }
}
