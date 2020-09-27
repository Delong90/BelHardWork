package by.belhard.j24.HomeWork.Self.Lesson06_07.Task02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        List<String> libraryString = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        libraryString.add("qqq");
        libraryString.add("qqqq");
        libraryString.add("qqqqq");
        libraryString.add("qqqqqq");
        libraryString.add("aaa");
        libraryString.add("aaaa");

        for (String x : libraryString){
            if(x.length()<5)
                result.append(x + " ");
        }

        System.out.println(result);
    }
}
