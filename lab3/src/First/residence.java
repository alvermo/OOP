package First;

class Residence {
    private int id;
    private double area;
    private String street;
    private int numberOfRooms;

    public Residence(int id, double area, String street, int numberOfRooms) {
        this.id = id;
        this.area = area;
        this.street = street;
        this.numberOfRooms = numberOfRooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String toString() {
        return "Residence{" +
                "id=" + id +
                ", area=" + area +
                ", street='" + street + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}