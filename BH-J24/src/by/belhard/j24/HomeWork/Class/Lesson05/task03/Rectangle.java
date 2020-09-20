package by.belhard.j24.HomeWork.Class.Lesson05.task03;

public class Rectangle extends Square {

    private int sideB;

    public Rectangle(int side, int sideB) {
        super(side);
        this.sideB = sideB;
    }

    public double square() {
        return getSideA() * sideB;
    }
}
