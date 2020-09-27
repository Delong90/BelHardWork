package by.belhard.j24.HomeWork.Self.Lesson08_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Map<String, ArrayList<Double>> map = new HashMap();
        double sum=0;


//        try {
//            Scanner scan = new Scanner(System.in);
//            System.out.print("Введите необходимое число товаров :");
//            i = scan.nextInt();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Введено невалидное значение.");
//        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите необходимое число товаров :");
            int i = Integer.parseInt(br.readLine());
            System.out.println(i);
            for (int j = 0;j < i;j++) {
               System.out.println("Ведите через пробел данные по товару НАИМЕНОВАНИЕ_ЦЕНА_КОЛИЧЕСТВО: ");
               String s = br.readLine();
               String[] string = s.split(" ");
               ArrayList<Double> arr = new ArrayList<>();
               arr.add(Double.parseDouble(string[1]));
               arr.add((double)Integer.parseInt(string[2]));
               map.put(string[0],arr);
                sum += arr.get(0)*arr.get(1);
           }
            System.out.println(map.toString());
            System.out.println("Конечная сумма всех введёных товаров: " +sum);




        } catch (IOException e) {
            System.out.println("Введено невалидное значение.");
            e.printStackTrace();
        }








//



    }
}
