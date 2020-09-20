package by.belhard.j24.HomeWork.Self.Lesson06_07.Task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args){

        Register register = new Register();
        System.out.println(register.toString());

        Person check = register.Search("Vasia");
        System.out.println(check.toString());



        check = register.Search("Lena");
        System.out.println(check.toString());



    }
}
