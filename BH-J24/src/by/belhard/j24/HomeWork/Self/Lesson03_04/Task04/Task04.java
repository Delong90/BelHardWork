package by.belhard.j24.HomeWork.Self.Lesson03_04.Task04;

public class Task04 {
    public static void main (String args[ ]) {
        System.out.println();
        System.out.println("Четвёртая задача задача");
        System.out.println();
        System.out.println("Опишите (то есть создайте класс, описывающий…) сущность Здание. " + "\n" +
                "Здание можно охарактеризовать назначением (например, жилой дом, офисное здание, " + "\n" +
                "промышленный объект, хоз. постройка и т.д.), адресом, количеством этажей, " + "\n" +
                "наличием(или отсутствием) лифта, материалом, из которого оно построено, " + "\n" +
                "годом постройки. Адрес состоит из улицы и номера дома.");
        System.out.println();

        Building building1 = new Building("Жилой дом",new Street("Ленина", 4),6, Elevator.есть,"дом кирпичный");
        System.out.println("Описание объекта building1:");
        //System.out.println(building1.number);


        Building building2 = new Building("Промышленное здание", new Street("Соколова", 3),2, Elevator.нету,"железобетонный каркас");
        System.out.println("Описание объекта building2:");
        System.out.println(building2);



    }
}
