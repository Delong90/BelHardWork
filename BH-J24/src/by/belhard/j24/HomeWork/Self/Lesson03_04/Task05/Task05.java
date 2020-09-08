package by.belhard.j24.HomeWork.Self.Lesson03_04.Task05;

public class Task05 {
    public static void main (String args[ ]) {
        System.out.println();
        System.out.println("Пятая задача");
        System.out.println();
        System.out.println("Создать класс Игрок. Игрок имеет координаты x и y. Игрок должен уметь (через методы):" + "\n" +
                "а) переместиться в новые координаты (то есть изменить свои текущие координаты на новые, переданные ему)," + "\n" +
                "б) вывести на консоль значение текущего положения," +"\n" +
                "5*. игрок должен хранить значение пройденного расстояния и уметь выводить на консоль это значение.");
        Player location = new Player();
        System.out.println();
        location.Step1();
        location.setX(0);
        location.setY(0);
        //System.out.println("Координаты расположения игрока (x,y): ("+location.getX()+","+location.getY()+")");
        location.Location();
        location.Step2();


        System.out.println();
        location.Step1();
        location.setX(1);
        location.setY(1);
        //System.out.println("Координаты расположения игрока (x,y): ("+location.getX()+","+location.getY()+")");
        location.Location();
        location.Step2();

        System.out.println();
        location.Step1();
        location.setX(2);
        location.setY(2);
        //System.out.println("Координаты расположения игрока (x,y): ("+location.getX()+","+location.getY()+")");
        location.Location();
        location.Step2();

        System.out.println();
        location.Step1();
        location.setX(52);
        location.setY(44);
        //System.out.println("Координаты расположения игрока (x,y): ("+location.getX()+","+location.getY()+")");
        location.Location();
        location.Step2();

        System.out.println();
        location.Step1();
        location.setX(30);
        location.setY(44);
        //System.out.println("Координаты расположения игрока (x,y): ("+location.getX()+","+location.getY()+")");
        location.Location();
        location.Step2();


    }
}
