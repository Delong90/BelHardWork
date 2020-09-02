package by.belhard.j24.HomeWork.Self.Lesson02;

import java.util.Scanner;

public class Task02 {

    public static void main(String args[ ]) {


        System.out.println();
        System.out.println("Вторая задача");
        System.out.println();
        System.out.println("Дан радиус окружности Radius(в метрах), необходимо выполнить проверку какого он знака, после чего, если он положительный, вычислить площадь и длину окружности");

        double Radius;
        double S, P;
        System.out.print("Введите радиус окружности: ");
        Scanner in = new Scanner(System.in);
        Radius = in.nextDouble();

        if (Radius > 0) {

           S = 3.141592*Radius*Radius;
           P = 2*3.141592*Radius;

            System.out.println();
            System.out.println("S = " + S + " - площадь окружности, м2");
            System.out.println();
            System.out.println("P = " + P + " - периметр окружности, м");
        }
            else {
            System.out.println();
            System.out.println("Входные данные невалидны, значение Radius должно быть строго больше нуля");
            }
    }
}