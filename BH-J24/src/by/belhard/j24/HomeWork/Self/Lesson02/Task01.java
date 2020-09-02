package by.belhard.j24.HomeWork.Self.Lesson02;

public class Task01 {

    public static void main (String args[ ]){


        System.out.println();
        System.out.println("Первая задача");
        System.out.println();
        System.out.println("Дано 4 числа различных типов (A,B,C,D), необходимо выполнить их сложение, перемножение, " +
                            "сумму произведений A*B+C*D и результат вычитания из числа D остальных чисел");


        byte A = 51;
        short B = 130;
        int C = 32800;
        long D = 2_200_000_000L;

        System.out.println();
        System.out.println(A+B+C+D + " - сумма чисел");

        System.out.println();
        System.out.println(A*B*C*D + " - произведение чисел");

        System.out.println();
        System.out.println(A*B+C*D + " - сумма произведений A*B+C*D");

        System.out.println();
        System.out.println(D-C-B-A + " - результат вычитания из числа D остальных чисел");
    }
}
