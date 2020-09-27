package by.belhard.j24.HomeWork.Self.Lesson08_09;

import java.io.*;
import java.util.*;

public class Task04 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();

        try (BufferedReader br = new BufferedReader(new FileReader("Lesson9Task4balance.dt"))) {
            while (br.ready()) {
                String[] s = br.readLine().split(" ");
                map.put(s[0], Integer.parseInt(s[1]));
            }
            System.out.println(map.toString());



        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br1 = new BufferedReader(new FileReader("Lesson9Task4transactions.dt"))) {
            while (br1.ready()) {
                String[] s = br1.readLine().split(" ");

                System.out.println("Текущая операция: "+s[0]+" переводит "+s[1]+" "+s[2]+" рублей");
//                System.out.println(map.get(s[0]));
//                System.out.println(map.get(s[1]));
            if (map.get(s[0])>=Integer.parseInt(s[2])&&map.get(s[0])!=null&&map.get(s[1])!=null){
                int q = map.get(s[0])-Integer.parseInt(s[2]);
                int w = map.get(s[1])+Integer.parseInt(s[2]);
                map.put(s[0],q);
                map.put(s[1],w);
                System.out.println(map.toString());
                System.out.println();
                } else {
                System.out.println("Дааная операция невалидна");
                System.out.println(map.toString());
                System.out.println();
            }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter output = new BufferedWriter (new FileWriter( "Lesson9Task4Output.txt"))){
            ArrayList<String> arr = new ArrayList();
            for(String name : map.keySet()){
                arr.add(name);
            }
            System.out.println(arr.toString());
            Collections.sort(arr);
            System.out.println(arr.toString());
            System.out.println(arr.get(0));

            for(int r = 0;r<arr.size();r++) {
                output.write(arr.get(r)+" "+ map.get(arr.get(r))+"\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
