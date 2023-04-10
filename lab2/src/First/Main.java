package First;

import Second.StringProcess;
import java.util.Scanner;


        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter the text:");
                String text = scanner.nextLine();

                System.out.println("Enter the string to search for:");
                String s = scanner.nextLine();

                System.out.println("Enter the string to insert:");
                String t = scanner.nextLine();

                String result = StringProcess.insertAfter(text, s, t);

                System.out.println("Initial text: " + text);
                System.out.println("Processed text: " + result);
            }
        }

