import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private double a, b, t;

    public static void main(String[] args) {
        calculateAndPrint();
        Main lab0 = new Main();
        lab0.run();
        date();
    }

    private void run() {
        scan();
        double y = this.calculate_Y();
        double s = this.calculate_S();
        this.print(y, s);
    }

    public static void calculateAndPrint() {
        double a = -0.5, b = 1.7, t = 0.44;
        double y, s, y1, s1;
        y = Math.pow(Math.E, -b * t) * Math.sin(a * t + b) - Math.sqrt(Math.abs(b * t + a));
        s = b * Math.sin(a * Math.pow(t, 2) * Math.cos(2 * t)) - 1;
        System.out.print("a = " + a + "\n" +
                "b = " + b + "\n" +
                "t = " + t + "\n" +
                "y = " + y + "\n" +
                "s = " + s + "\n");
    }

    private void scan() {
        Scanner scn = new Scanner(System.in);
        System.out.print("vvedit a: ");
        a = scn.nextDouble();
        System.out.print("vvedit b: ");
        b = scn.nextDouble();
        System.out.print("vvedit t: ");
        t = scn.nextDouble();
    }

    private double calculate_Y() {
        return Math.pow(Math.E, -b * t) * Math.sin(a * t + b) - Math.sqrt(Math.abs(b * t + a));
    }

    private double calculate_S() {
        return b * Math.sin(a * t * t * Math.cos(2 * t) - 1);
    }

    private void print(double y, double s) {
        System.out.println("y = " + y);
        System.out.println("s = " + s);
    }

    public static void date() {
        DateFormat dateFormat = new SimpleDateFormat("d 0M yyyy");
        String date = dateFormat.format(new Date());
        System.out.println(date);

    }
}

