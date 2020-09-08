package by.belhard.j24.HomeWork.Self.Lesson03_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task01 {
    public static void main (String args[ ]) {

        System.out.println();
        System.out.println("Первая задача");
        System.out.println();
        System.out.println("Создать массив целых чисел, записать в него 10 значений. Посчитать и вывести сумму всех значений и среднее значение.\n" +
                "\n" +
                "1*. Посчитать и вывести медиану.");
        int[] array = new int[10];
        double sum = 0;
        double average;
        double median;
        ArrayList list = new ArrayList<>();



        for(int i =0; i<10; i++){
            System.out.println("Введите число номер " + (i) +": ");
            Scanner in = new Scanner(System.in);
            array[i] = in.nextInt();
            sum += array[i];
            list.add(array[i]);

        }
        average = sum/10;

        Collections.sort(list);

        double a = (int) list.get(4);
        double b = (int) list.get(5);
        median = (a+b)/2;

        System.out.println("Сумма всех чисел массива равна: " + sum);
        System.out.println("Среднее арифметическое всех чисел массива равно: " + average);

        System.out.println("Отсортированные числа массива от минимального к максимальному: " + list);
        System.out.println("Медиана массива равна: " + median);

    }

}
