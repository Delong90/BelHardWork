package by.belhard.j24.HomeWork.Class.Lesson03_04.buildingTask;

public class Building {

    private Address address;

    private Material material;

    private int floors;

    private boolean hasElevator;

    public Building(Address address, Material material, int floors, boolean hasElevator) {
        this.address = address;
        this.material = material;
        this.hasElevator = hasElevator;
        if (floors <= 0)
            floors = 1;
        this.floors = floors;
    }

}
