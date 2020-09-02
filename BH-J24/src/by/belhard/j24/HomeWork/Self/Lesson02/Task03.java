package by.belhard.j24.HomeWork.Self.Lesson02;

import java.util.Scanner;
public class Task03 {

    public static void main(String args[]) {


        System.out.println();
        System.out.println("Третья задача");
        System.out.println();
        System.out.println("Дана температура в градусах, необходимо вывести на экран рекомендации что лучше надеть: куртку, ветровку, свитер, майку или ничего");
        int Temperature;

        System.out.println("Введите температуру: ");
        Scanner in = new Scanner(System.in);
        Temperature = in.nextInt();


        if (Temperature < 10) {
            System.out.println();
            System.out.println("Температура равна " + Temperature + " градусов цельсия, рекомендуется надеть КУРТКУ");
        } else {
            if (Temperature < 15) {
                System.out.println();
                System.out.println("Температура равна " + Temperature + " градусов цельсия, рекомендуется надеть ВЕТРОВКУ");
            } else {
                if (Temperature < 20) {
                    System.out.println();
                    System.out.println("Температура равна " + Temperature + " градусов цельсия, рекомендуется надеть СВИТЕР");
                } else {
                    if (Temperature < 30) {
                        System.out.println();
                        System.out.println("Температура равна " + Temperature + " градусов цельсия, рекомендуется надеть МАЙКУ");
                    } else {
                        System.out.println();
                        System.out.println("Температура равна " + Temperature + " градусов цельсия, рекомендуется ничего не надевать, главное не сгорите на солнце:)");
                    }
                }
            }


        }
    }
}