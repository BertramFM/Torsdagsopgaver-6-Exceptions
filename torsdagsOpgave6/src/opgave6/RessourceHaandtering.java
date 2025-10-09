package opgave6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RessourceHaandtering {
    public void laesOgSkrivFil(String inputFil, String outputFil) {
        Scanner scanner = null;
        PrintWriter writer = null;

        try {
            // Opret Scanner til at læse fra inputFil
            File file = new File(inputFil);
            scanner = new Scanner(file);

            // Opret PrintWriter til at skrive til outputFil
            writer = new PrintWriter(outputFil);

            // Læs linjer og skriv dem til output
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine());
            }

        } catch(FileNotFoundException e){
                // Håndter exception
                System.out.println("Fil ikke fiundet");

        } finally{
            // Luk både scanner og writer hvis de ikke er null
            if (writer != null) {
                writer.close();
            }
            if (scanner != null) {
                scanner.close();
            }
            // Håndter eventuelle exceptions her også
        }
    }
}

