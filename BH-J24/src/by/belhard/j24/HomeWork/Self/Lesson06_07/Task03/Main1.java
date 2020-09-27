package by.belhard.j24.HomeWork.Self.Lesson06_07.Task03;



import java.util.HashSet;
import java.util.Iterator;


public class Main1 {
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

        System.out.println("Множество: " + bunch);
        System.out.println("Размер множества: " + bunch.size());
    }
}




