package by.belhard.j24.HomeWork.Self.Lesson03_04;

public class Task03 {
    public static void main (String args[ ]) {
        int[] array = new int[100];
        System.out.print("Числа которые делятся одновременно на 3 и на 7 без остатка: ");
        for(int i = 0; i<100;i++){
            array[i]=i+1;
            if(array[i]%3==0 && array[i]%7==0){System.out.print(array[i] + " ");}
        }
        System.out.println();
        System.out.print("Числа которые делятся либо на 5, либо на 7 без остатка: ");
        for(int i = 0; i<100;i++){
            array[i]=i+1;
            if(array[i]%5==0 || array[i]%7==0){
                if(array[i]%5==0 && array[i]%7==0){continue;}
                else{System.out.print(array[i] + " ");}
            }
        }

        System.out.println();
        System.out.print("Числа из диапазонов [10; 19], [30; 39], [50; 59], [70; 79], [90; 99], " + "\n" +
                "которые делятся либо на 5, либо на 7, но не одновременно на 5 и на 7 :");
        for(int i = 0; i<100;i++){
            array[i]=i+1;
        }


        for(int i = 9; i<100;i=i+20){
            for(int j =0;j<10;j++){
            if(array[i+j]%5==0 || array[i+j]%7==0) {
                if (array[i+j] % 5 == 0 && array[i+j] % 7 == 0) {continue;}
                else {System.out.print(array[i+j] + " ");}
                }
            }
        }


    }

}
