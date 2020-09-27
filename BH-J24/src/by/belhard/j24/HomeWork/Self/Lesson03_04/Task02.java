package by.belhard.j24.HomeWork.Self.Lesson03_04;

import java.util.Arrays;

public class Task02 {
        public static void main (String args[ ]) {
        int n = 4;
        int intStart = 2;
        int[][] array = new int[n][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                array[i][j] = intStart;
                System.out.print(array[i][j] + " ");
                intStart *= 2;
            }
            System.out.println();
        }


        }
}
