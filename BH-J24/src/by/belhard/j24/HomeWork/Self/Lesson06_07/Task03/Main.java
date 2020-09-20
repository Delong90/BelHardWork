package by.belhard.j24.HomeWork.Self.Lesson06_07.Task03;


import java.util.HashSet;

public class Main {
    public static void main (String[] args){
        int border;
        int n=10;
        int[] y = new int[n];
        int j = 0;

        HashSet<Integer>bunch = new HashSet<>(n);

//создание множества и генерация числа по которому будет отсеивать
        for(int i = 0; i<n;i++){
        bunch.add((int)(Math.random()*100));
        }
        System.out.println("Множество: "+bunch);
        border =(int) (Math.random()*100);
        System.out.println("Случайное число: "+border);
        System.out.println( "Размер множества: "+bunch.size());


//перебор всех элементов, внесение нужных элементов для удаления в массив
        for (int x:bunch){
            if (x<border){
                y[j]=x;
                j++;
                System.out.println("Исключено из множества: "+x);
            }
        }

//удаление необходимых элементов
        for (int x:y){bunch.remove(x);}
        System.out.println("Откорректированное множество: "+bunch);
        System.out.println( "Размер окорректированного множества: "+bunch.size());




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


