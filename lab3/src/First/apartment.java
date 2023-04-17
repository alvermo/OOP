package First;

class Apartment extends Residence {
    private int apartmentNumber;
    private int floor;

    public Apartment(int id, double area, String street, int numberOfRooms, int apartmentNumber, int floor) {
        super(id, area, street, numberOfRooms);
        this.apartmentNumber = apartmentNumber;
        this.floor = floor;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String toString() {
        return "Apartment{" +
                "id=" + super.getId() +
                ", area=" + super.getArea() +
                ", street='" + super.getStreet() + '\'' +
                ", numberOfRooms=" + super.getNumberOfRooms() +
                ", apartmentNumber=" + apartmentNumber +
                ", floor=" + floor +
                '}';
    }
}