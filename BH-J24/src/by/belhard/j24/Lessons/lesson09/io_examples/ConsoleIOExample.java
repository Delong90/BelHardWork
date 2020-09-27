package by.belhard.j24.Lessons.lesson09.io_examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ConsoleIOExample {
    public static void main(String[] args) {
        String s = "";

        Map<String, Integer> map = new HashMap<>();

        // try-with-resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while (!s.equals("e")) {

                s = br.readLine();  //присвоение строке введённых значений они должны быть разделены пробелами первое буквы второе цифры
                String[] splitted = s.split(" "); // Vasily 25
                int i = Integer.parseInt(splitted[1]);
                int i2 = Integer.parseInt(splitted[3]);
                map.put(splitted[0], i);
                map.put(splitted[2], i2);

                System.out.println(s);
                System.out.println(map.toString());
            }
        } catch (IOException e) {
            System.err.println("IOException");
        }

        System.out.println("END");
    }


}
