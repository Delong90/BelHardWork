package by.belhard.j24.HomeWork.Self.Lesson03_04.Task04;

public class Building {

    private String appointment;
    public Street street;
    private int floor;
    private Elevator elevator;
    private String material;


    public Building(String appointment, Street street, int floor, Elevator elevator, String material) {
        this.appointment = appointment;
        this.street = street;
        this.floor = floor;
        this.elevator = elevator;
        this.material = material;
    }

    @Override
    public String toString() {
        return
                "Тип строения: " + appointment + "\n" +
                "Адрес: улица "+street+"дом"+"\n" +
                "Этажность дома: " + floor + " этажей" + "\n" +
                "Наличие лифта: " + elevator + "\n" +
                "Материал несущих конструкций: " + material + "\n";
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }


    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Elevator getElevator() {
        return elevator;
    }

    public void setElevator(Elevator elevator) {
        this.elevator = elevator;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
