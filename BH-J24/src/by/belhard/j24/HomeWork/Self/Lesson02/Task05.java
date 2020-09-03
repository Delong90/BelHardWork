package by.belhard.j24.HomeWork.Self.Lesson02;
import java.util.Scanner;
public class Task05 {

    public static void main(String args[]) {

        System.out.println();
        System.out.println("Пятая задача");
        System.out.println();
        System.out.println("Даны числа a и n, при помощи цикла возвести a в степень n");

        int a, n;

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите число возводимое в степень: ");
        a = in.nextInt();
        System.out.println();
        System.out.print("Введите степень в которую будет возводится число: ");
        n = in.nextInt();



        int b = 1;

        for(int c = 1 ;c<=n;c++){
                b *= a;
                if(c-n==0) {
                System.out.println();
                System.out.println(a + "^" + n + " = " + b + "    - " + a + " в степени " + n);
                }
                }
        }
}



