package by.belhard.j24.SelfEducation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsSelf {
    public static void main(String[] args) {
        int border;
        int n = 10;


        HashSet<Integer> bunch = new HashSet<>(n);

//создание множества и генерация числа по которому будет отсеивать
        for (int i = 0; i < n; i++) {
            bunch.add((int) (Math.random() * 100));
        }
        System.out.println("Множество: " + bunch);
        border = (int) (Math.random() * 100);
        System.out.println("Случайное число: " + border);
        System.out.println("Размер множества: " + bunch.size());


        Iterator<Integer> iterator = bunch.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < border) {
                iterator.remove();
            }
        }


        //System.out.println(bunch.add(10));  //добавление
        //System.out.println(bunch.addAll(bunch));   //добавить одну коллекцию к другой
        //bunch.clear();   //очистка коллекции
        //System.out.println(bunch.contains(10));   //проверка наличия 10
        //System.out.println(bunch.containsAll(bunch));   //сравнение коллекций
        //System.out.println(bunch.isEmpty());      //проврка есть ли элементы в коллекции тру если пусто

        //System.out.println(bunch.add(10));
        //System.out.println(bunch.remove(10));    //удаление объекта

        //System.out.println(bunch.removeAll(bunch));   //удаление всех элементов одной коллекции из другой
        //System.out.println(bunch.retainAll(bunch));   //удаление всех элементов одной коллекции кроме элементов другой коллекции

        //System.out.println(bunch.size());  //размер коллекции
        //System.out.println(bunch.spliterator());  //???


        //Object[] a = bunch.toArray();
        // System.out.println(a);


        //Integer [] b = bunch.toArray(new Integer []{});
        // System.out.println(b[0]);
        //System.out.println(Arrays.toString(b));
        //int c,b,g;
        //System.out.println(Integer.sum(b = 5, g = 6));


        System.out.println("Множество: " + bunch);
        System.out.println("Размер множества: " + bunch.size());
    }
}
