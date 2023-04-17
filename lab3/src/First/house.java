package First;

class House extends Residence {
    private int numberOfFloors;
    private double yardArea;

    public House(int id, double area, String street, int numberOfRooms, int numberOfFloors, double yardArea) {
        super(id, area, street, numberOfRooms);
        this.numberOfFloors = numberOfFloors;
        this.yardArea = yardArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getYardArea() {
        return yardArea;
    }

    public void setYardArea(double yardArea) {
        this.yardArea = yardArea;
    }

    public String toString() {
        return "House{" +
                "id=" + super.getId() +
                ", area=" + super.getArea() +
                ", street='" + super.getStreet() + '\'' +
                ", numberOfRooms=" + super.getNumberOfRooms() +
                ", numberOfFloors=" + numberOfFloors +
                ", yardArea=" + yardArea +
                '}';
    }
}
