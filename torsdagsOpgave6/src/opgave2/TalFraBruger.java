package opgave2;

import java.util.Scanner;

public class TalFraBruger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         The while loop will run until the try/catch get to break;

         The try/catch goes line by line, and if it enconters an error,
         throw the numberFormatException and never reach the break;
         */
    while (true) {
        try {
            System.out.print("Indtast dit fødselsår: ");
            int input = Integer.parseInt(scanner.nextLine());
            int userAge = 2025 - input;
            System.out.println("You are " + userAge + " years old.");
            break; // If the user enters a valid number, the loop will stop
        } catch (NumberFormatException e) {
            System.out.println("Du har ikke indtastet et gyldigt tal! Prøv igen");
        }
    }

        // Brug Integer.parseInt til at konvertere input til int
        // Beregn brugerens alder (antag at nuværende år er 2025)
        // Print alderen
    }
}