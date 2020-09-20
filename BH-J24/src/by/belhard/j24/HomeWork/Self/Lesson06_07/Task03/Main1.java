package by.belhard.j24.HomeWork.Self.Lesson06_07.Task03;


import java.util.HashSet;
import java.util.Iterator;

public class Main1 {
    public static void main (String[] args){
        int border;
        int n=10;


        HashSet<Integer>bunch = new HashSet<>(n);

//создание множества и генерация числа по которому будет отсеивать
        for(int i = 0; i<n;i++){
            bunch.add((int)(Math.random()*100));
        }
        System.out.println("Множество: "+bunch);
        border =(int) (Math.random()*100);
        System.out.println("Случайное число: "+border);
        System.out.println( "Размер множества: "+bunch.size());



        Iterator<Integer> iterator = bunch.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < border) {
                bunch.remove(iterator.next());
            }
        }
        System.out.println("Множество: "+bunch);
        System.out.println( "Размер множества: "+bunch.size());

 //не универсальный метод рассматривался для понимания работы класса и его комманд
//        for (int i = 0; i<n;i++);{
//            for (int j = 0; j<100;j++){
//                if(bunch.contains(j)){
//                    if (j<border) bunch.remove(j);
//                    continue;
//                }
//            }
//        }
//        System.out.println(bunch);
//        System.out.println( bunch.size());




//        HashSet<Integer>bunch1 = new HashSet<>(n);
//            bunch1.add(3);
//            bunch1.add(1);
//            bunch1.add(5);
//            bunch1.add(3);
//            bunch1.add(6);
//        System.out.println(bunch1);
//        System.out.println( bunch1.contains(9));
//        bunch1.remove(1);
//        System.out.println(bunch1);
    }

}


