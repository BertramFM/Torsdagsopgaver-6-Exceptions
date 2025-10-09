package opgave4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLaeserProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileIO fileIO = new FileIO();
        String indhold = "";

        while (true) {
            try {
                System.out.println("Indtast filnavn (med .txt):");
                indhold = fileIO.laesFilIndhold(scanner.nextLine());
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Fil ikke fundet!");
            }
        }
        System.out.println("filens indhold er:");
        System.out.println(indhold);




        // Bed brugeren om filnavn
        // Kald fileIO.laesFilIndhold() i en try-catch
        // Hvis FileNotFoundException: bed om nyt filnavn og prøv igen
        // Fortsæt indtil en gyldig fil er læst
        // Print filens indhold
    }
}
