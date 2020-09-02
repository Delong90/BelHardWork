package by.belhard.j24.SelfEducation;
//sdfsd
//sdfsd
//sfsdf

import java.util.Scanner;

public class Delon {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество сравниваемых чисел: ");
        n = in.nextInt();
        double[] array = new double[n];
        for (int j = 0; j < n; j++) {
            System.out.println("Введите число номер " + (j + 1) + ": ");
            array[j] = in.nextDouble();
        }


        double max = array[0];
        double min = array[0];

        for (int i = 0; i < n; i++) {
            max = array[i] > max ? array[i] : max;
            min = array[i] < min ? array[i] : min;
            if (i == n - 1) {
                double delta = max - min;
                System.out.println("Максимальная зарплата: " + max);
                System.out.println("Минимальная зарплата: " + min);
                System.out.println("Разница между максимальной и минимальной зарплатой равна: " + delta);
            }
        }
    }
}