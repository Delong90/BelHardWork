package by.belhard.j24.HomeWork.Self.Lesson05.Task04;

import java.util.Arrays;
import java.util.Random;

public class Temperature {
    private int startTemp;
    private int dayDif;
    private int days;
    private double j;


    public Temperature(int startTemp, int dayDif, int days) {
        this.startTemp = startTemp;
        this.dayDif = dayDif;
        this.days = days;
        double[] array = new double[days];
        for(int i=0;i<days;i++){array[i]=startTemp;}
        }

    public void Iteration(){
        double[] array = new double[days];
        for(int i=0;i<days;i++){array[i]=startTemp;}
        System.out.println(Arrays.toString(array));
        j=startTemp;
        for (int i =0;i<days;i++){
            array[i]=j;
            j+=(0.5-Math.random())*2*dayDif;
        }
        System.out.println(Arrays.toString(array));
    }



}
