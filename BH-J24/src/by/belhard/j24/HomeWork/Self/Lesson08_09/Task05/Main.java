package by.belhard.j24.HomeWork.Self.Lesson08_09.Task05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> allList = new ArrayList();
//        Map<String,Integer> map = new HashMap();

        Person vasia = new Person("vasia","milk","burger","apple","milk");
        allList.addAll(0, Arrays.asList(vasia.list));

        Person katia = new Person("katia","milk","burger");
        allList.addAll(0, Arrays.asList(katia.list));


        Person dima = new Person("dima","milk","burger","pizza");
        allList.addAll(0, Arrays.asList(dima.list));

        System.out.println(allList.toString());

//        for (String t : allList){
//            if (map.get(t)!=null){
//                map.put(t,map.get(t)+1);
//            }else map.put(t,1);
//        }

        System.out.println(add(allList).toString());

        Person liza = new Person("liza","milk","burger","pizza","pizza","pizza");
        allList.addAll(0, Arrays.asList(liza.list));

        System.out.println(add(allList).toString());

    }

    private static Map<String, Integer> add(ArrayList<String> s) {
        Map<String,Integer> map = new HashMap();
        for (String t : s){
            if (map.get(t)!=null){
                map.put(t,map.get(t)+1);
            }else map.put(t,1);
        }
        return map;
    }

}
