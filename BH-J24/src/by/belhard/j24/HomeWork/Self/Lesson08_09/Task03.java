package by.belhard.j24.HomeWork.Self.Lesson08_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task03 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        double result=0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Вводите необходимые арифмметические выражения, при неоюходимости выхода введите q.");

            while (!s.equals("q")) {
                s = new StringBuilder();
                s.append(br.readLine());
//                System.out.println("длина s: " + s.length());

                for (int i = 0; i < s.length(); i++) {      //избавление от пробелов
//                    System.out.print(s.charAt(i));
                    if (s.charAt(i) == ' ') {
                        s.deleteCharAt(i);
                        i--;
                    }
                }

                System.out.println("вывод s: " + s);


                if (s.indexOf("*") != -1) {
//                System.out.println(s.subSequence(0,s.indexOf("*")));
//                System.out.println(s.subSequence((s.indexOf("*")+1),s.length()));
                    double first = Integer.parseInt(String.valueOf(s.subSequence(0, s.indexOf("*"))));
                    double second = Integer.parseInt(String.valueOf(s.subSequence((s.indexOf("*") + 1), s.length())));
                    result = first * second;
//                System.out.println(first);
//                System.out.println(second);
                } else{
                if (s.indexOf("/") != -1) {
                    double first = Integer.parseInt(String.valueOf(s.subSequence(0, s.indexOf("/"))));
                    double second = Integer.parseInt(String.valueOf(s.subSequence((s.indexOf("/") + 1), s.length())));
                    result = first / second;
                }else {
                if (s.indexOf("+") != -1) {
                    double first = Integer.parseInt(String.valueOf(s.subSequence(0, s.indexOf("+"))));
                    double second = Integer.parseInt(String.valueOf(s.subSequence((s.indexOf("+") + 1), s.length())));
                    result = first + second;
                }else{
                if (s.lastIndexOf("-") != -1 && s.lastIndexOf("-") != 0) {

                    double first = Integer.parseInt(String.valueOf(s.subSequence(0, s.lastIndexOf("-"))));
                    double second = Integer.parseInt(String.valueOf(s.subSequence((s.lastIndexOf("-") + 1), s.length())));
                    result = first - second;
                }}}}


                System.out.println("Результат выражения равен: " + result);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
