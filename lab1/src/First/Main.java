package First;

import Second.House;

public class Main {

    public static void printHousesByRooms(int rooms, House[] housesArray) {
        for (House house : housesArray) {
            if (house.getNumberOfRooms() == rooms) {
                System.out.println(house.toString());
            }
        }
    }


    public static void printHousesWithRoomsAndFloorRange(House[] houses, int numberOfRooms, int floorMin, int floorMax) {
        for (House house : houses) {
            if (house.getNumberOfRooms() == numberOfRooms && house.getFloor() >= floorMin && house.getFloor() <= floorMax) {
                System.out.println(house.toString());
            }
        }
    }


    public static House[] createArray(){
        House[] houses = new House[10];
        houses[0] = new House(1, 2, 70.0, 2, 2, "L.Ukrainki Street");
        houses[1] = new House(2, 1, 110.0, 4, 4, "Malushka Street");
        houses[2] = new House(3, 16, 85.0, 1, 5, "Pidgorodnya Street");
        houses[3] = new House(4, 24, 120.0, 5, 5, "Zavodska Street");
        houses[4] = new House(5, 5, 55.0, 3, 1, "Dilova Street");
        houses[5] = new House(6, 21, 95.0, 2, 5, "Brovarna Street");
        houses[6] = new House(7, 3, 45.0, 1, 5, "Dovzenka Street");
        houses[7] = new House(8, 14, 75.0, 3, 2, "Kozacka Street");
        houses[8] = new House(9, 10, 65.0, 2, 2, "Stepova Street");
        houses[9] = new House(10, 6, 50.0, 1, 1, "Gayova Street");
        return houses;
    }

    public static void listHousesWithAreaGreaterThan(House[] houses, double area) {
        for (House house : houses) {
            if (house.getArea() > area) {
                System.out.println(house);
            }
        }
    }
    public static void main(String[] args) {
        var arr = createArray();
        //printHousesByRooms(5, arr);
        //printHousesWithRoomsAndFloorRange(arr, 5, 2,5);
        listHousesWithAreaGreaterThan(arr,70);

    }
}