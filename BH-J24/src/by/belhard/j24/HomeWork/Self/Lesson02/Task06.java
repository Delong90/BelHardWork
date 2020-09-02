package by.belhard.j24.HomeWork.Self.Lesson02;

public class Task06 {

    public static void main(String args[]) {

        System.out.println();
        System.out.println("Шестая задача");
        System.out.println();
        System.out.println("Банк предлагает вклад под процент. Дано: начальная сумма вклада startSum," +
                " процент годовых proc, количество лет years, на которые совершается вклад. Сумма индексируется" +
                " каждый год (это значит, что после каждого года процент начисляется не на изначальную сумму, а на текущую)." +
                " Вывести, сколько денег будет на счету после years лет" +
                "*доп. Каждый год банк вычитает из суммы вклада налог в размере 1% от изначального вклада.");



        double StartSum = 45600;
        double Percent = 13;
        int Years = 2;
        double tax = 0.01*StartSum;
        double FinishSum = StartSum*((100 + Percent) / 100)-tax;

        for (int a = 1; Years - a >= 0; a++) {
            if (Years - a == 0) {
                System.out.println();
                System.out.println(FinishSum + " - размер вклада по прошествии " + Years + " лет, при ежегодной ставке " + Percent + "%, и ежегодном налоге равном 1%");
            }
            FinishSum = FinishSum*((100 + Percent) / 100) - tax;
        }



    }
}