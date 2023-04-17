package First;

public class Main {
    public static void main(String[] args) {
        Residence[] residences = new Residence[8];


        residences[0] = new Residence(1, 100, "Main Street", 3);
        residences[1] = new Residence(2, 200, "Second Street", 4);
        residences[2] = new Residence(3, 150, "Third Street", 2);
        residences[3] = new Residence(4, 250, "Fourth Street", 5);


        residences[4] = new House(5, 300, "Fifth Street", 6, 3, 500);
        residences[5] = new House(6, 400, "Sixth Street", 7, 4, 750);


        residences[6] = new Apartment(7, 50, "Seventh Street", 1, 5, 3);
        residences[7] = new Apartment(8, 80, "Eighth Street", 2, 7, 4);

        for (int i = 0; i < residences.length; i++) {
            System.out.println(residences[i]);
        }
    }
}