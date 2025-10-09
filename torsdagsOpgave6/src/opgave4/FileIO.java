package opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

    public String laesFilIndhold(String filnavn) throws FileNotFoundException {
        // Opret Scanner med File
        File file = new File(filnavn);
        Scanner sc = new Scanner(file);

        // Læs hele filens indhold (alle linjer samlet i en String)
        String indhold = "";
        while (sc.hasNextLine()) {
            indhold += sc.nextLine() + "\n";
        }

        // Luk Scanner
        sc.close();

        // Returner indholdet
        return indhold;
    }
}
