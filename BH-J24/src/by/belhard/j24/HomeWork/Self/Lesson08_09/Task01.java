package by.belhard.j24.HomeWork.Self.Lesson08_09;

import java.io.*;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] arr = new int[10];;
        int i = 0;
        String data;
        StringBuilder data1 = new StringBuilder();

        try(BufferedReader input = new BufferedReader(new FileReader( "Lesson9Task1Input.txt"))){

            while (input.ready()) {
                data = input.readLine().trim();
                System.out.println(data);

                for(String s : data.split(" ")){
                arr[i] = Integer.parseInt(s);
                arr[i] = arr[i]*arr[i]*arr[i];
                i++;
                }


            }
            System.out.println("Было произведено чтение значений из исхоного файла");
            System.out.println(Arrays.toString(arr));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter output = new BufferedWriter (new FileWriter( "Lesson9Task1Output.txt"))){

            for(int j = 0;j<i;j++){
            data1.append(arr[j]).append(" ");
            }

            output.write(String.valueOf(data1));
            System.out.println(data1);

            } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
