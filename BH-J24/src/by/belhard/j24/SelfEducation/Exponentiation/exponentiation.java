package by.belhard.j24.SelfEducation.Exponentiation;


public class exponentiation {
        void step(int a,int n) {
    int b = 1;
    for (int c = 1; c <= n; c++) {
        b *= a;
               }
            System.out.println(a + "^" + n + " = " + b + "    - " + a + " в степени " + n);
    }
}
