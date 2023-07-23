package Day4;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your valid age: ");

        int UserAge = scanner.nextInt();

        if (UserAge > 1 && UserAge <= 13) {
            System.out.println("you are a child.");
        } else if (UserAge > 13 && UserAge <= 30) {
            System.out.println("you are young");
        } else if (UserAge > 30 && UserAge <= 50) {
            System.out.println("you are middle age.");

        } else if (UserAge > 50 && UserAge <= 100) {
            System.out.println("you are old");

        } else if (UserAge <= 0 || UserAge > 100) {
            System.out.println("Please put a valid age");
        }

        scanner.close();

    }}



