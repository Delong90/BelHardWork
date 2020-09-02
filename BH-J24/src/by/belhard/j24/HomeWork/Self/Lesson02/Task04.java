package by.belhard.j24.HomeWork.Self.Lesson02;

public class Task04 {

    public static void main(String args[]) {


        System.out.println();
        System.out.println("Четвёртая задача");
        System.out.println();
        System.out.println("Даны зарплаты трёх людей найти разницу между максимальной и минимальной зарплатой");

        double Salary1 = 156.3;
        double Salary2 = 156.3;
        double Salary3 = 156.3;


        if (Salary1==Salary2 & Salary1==Salary3) {
            System.out.println();
            System.out.println("Зарпалаты всех трёх рабочих равны");
        } else {
            if (Salary1 == Salary2) {
                System.out.println();
                System.out.println("Зарпалата Salary1 равна зарплате Salary2");
            } else {
                if (Salary1 == Salary3) {
                    System.out.println();
                    System.out.println("Зарпалата Salary1 равна зарплате Salary3");
                } else {
                    if (Salary2 == Salary3) {
                        System.out.println();
                        System.out.println("Зарпалата Salary2 равна зарплате Salary3");
                    }
                }
            }
        }



        if (Salary1 > Salary2 & Salary1 > Salary3) {
            if (Salary2 > Salary3) {
                System.out.println();
                System.out.println("Максимальная зарплата Salary1");
                System.out.println("Минимальная зарплата Salary3");
                System.out.println();
                System.out.println(Salary1 - Salary3 + " - разность между максимальной и минимальной зарплатами");
            } else {
                System.out.println();
                System.out.println("Максимальная зарплата Salary1");
                System.out.println("Минимальная зарплата Salary2");
                System.out.println();
                System.out.println(Salary1 - Salary2 + " - разность между максимальной и минимальной зарплатами");
            }
        } else {
            if (Salary2 > Salary1 & Salary2 > Salary3) {
                if (Salary1 > Salary3) {
                    System.out.println();
                    System.out.println("Максимальная зарплата Salary2");
                    System.out.println("Минимальная зарплата Salary3");
                    System.out.println();
                    System.out.println(Salary2 - Salary3 + " - разность между максимальной и минимальной зарплатами");
                } else {
                    System.out.println();
                    System.out.println("Максимальная зарплата Salary2");
                    System.out.println("Минимальная зарплата Salary1");
                    System.out.println();
                    System.out.println(Salary2 - Salary1 + " - разность между максимальной и минимальной зарплатами");
                }
            } else {
                if (Salary1 > Salary2) {
                    System.out.println();
                    System.out.println("Максимальная зарплата Salary3");
                    System.out.println("Минимальная зарплата Salary2");
                    System.out.println();
                    System.out.println(Salary3 - Salary2 + " - разность между максимальной и минимальной зарплатами");
                } else {
                    System.out.println();
                    System.out.println("Максимальная зарплата Salary3");
                    System.out.println("Минимальная зарплата Salary1");
                    System.out.println();
                    System.out.println(Salary3 - Salary1 + " - разность между максимальной и минимальной зарплатами");
                }
            }
        }




    }
}
