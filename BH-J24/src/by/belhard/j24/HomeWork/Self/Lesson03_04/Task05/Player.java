package by.belhard.j24.HomeWork.Self.Lesson03_04.Task05;

public class Player {
    static double x;
    static double y;
    static double xx;
    static double yy;

    static double distance;
    static double sumDistance;


    public void Location(){
        System.out.println("Координаты расположения игрока (x,y): ("+x+","+y+")");
    }

    public void Step1(){
        xx = x;
        yy = y;
    }
    public void Step2(){
        distance = Math.sqrt((x-xx)*(x-xx)+(y-yy)*(y-yy));
        System.out.println("Преодалённая дистанция относительно прошлого положения: " + distance);
        sumDistance +=distance;
        System.out.println("Общая преодалённая дистанция: " + sumDistance);
    }


    public static double getX() {
        return x;
    }

    public static void setX(double x) {
        Player.x = x;
    }

    public static double getY() {
        return y;
    }

    public static void setY(double y) {
        Player.y = y;
    }

    public static double getXx() {
        return xx;
    }

    public static void setXx(double xx) {
        Player.xx = xx;
    }

    public static double getYy() {
        return yy;
    }

    public static void setYy(double yy) {
        Player.yy = yy;
    }

    public static double getDistance() {
        return distance;
    }

    public static void setDistance(double distance) {
        Player.distance = distance;
    }
}
