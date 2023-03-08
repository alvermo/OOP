import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            obrahyvanya();
        }
        public static void obrahyvanya() {
            double a = -0.5, b = 1.7, t = 0.44;
            double y,s,y1,s1;
            y = Math.pow(Math.E, -b * t) * Math.sin(a * t + b) - Math.sqrt(Math.abs(b * t + a));
            s = b * Math.sin(a * Math.pow(t, 2) * Math.cos(2 * t)) - 1;
            System.out.print("a = " + a +  "\n" +
                    "b = " + b + "\n" +
                    "t = " + t + "\n" +
                    "y = " + y + "\n" +
                    "s = " + s + "\n");
            date();
    }
    public static void date() {
        DateFormat dateFormat = new SimpleDateFormat("d 0M yyyy");
        String date = dateFormat.format(new Date());
        System.out.println(date);
        obrah_keyboard();
    }
    public static void obrah_keyboard(){
        Scanner num = new Scanner(System.in);
        double a,b,t,y,s;
            System.out.print("vvedit a:");
            a = num.nextDouble();
        System.out.print("vvedit b:");
        b = num.nextDouble();
        System.out.print("vvedit t:");
        t = num.nextDouble();
        y = Math.pow(Math.E, -b * t) * Math.sin(a * t + b) - Math.sqrt(Math.abs(b * t + a));
        s = b * Math.sin(a * Math.pow(t, 2) * Math.cos(2 * t)) - 1;
        System.out.print("a = " + a +  "\n" +
                "b = " + b + "\n" +
                "t = " + t + "\n" +
                "y = " + y + "\n" +
                "s = " + s + "\n");
    }
        }
