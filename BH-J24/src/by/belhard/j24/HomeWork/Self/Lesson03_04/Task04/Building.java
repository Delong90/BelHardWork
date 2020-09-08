package by.belhard.j24.HomeWork.Self.Lesson03_04.Task04;

public class Building {

    private String appointment;
    private String  street;
    private int  numberHouse;
    private int floor;
    private Elevator elevator;
    private String material;


    public Building(String appointment, String street, int numberHouse, int floor, Elevator elevator, String material) {
        this.appointment = appointment;
        this.street = street;
        this.numberHouse = numberHouse;
        this.floor = floor;
        this.elevator = elevator;
        this.material = material;
    }

    @Override
    public String toString() {
        return
                "Тип строения: " + appointment + "\n" +
                "Адрес: улица " +street+ ", номер дома: " +numberHouse+ "\n" +
                "Этажность дома: " + floor + " этажей" + "\n" +
                "Наличие лифта: " + elevator + "\n" +
                "Материал несущих конструкций: " + material + "\n";
    }



}
