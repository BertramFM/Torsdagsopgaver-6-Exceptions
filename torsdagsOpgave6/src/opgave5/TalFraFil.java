package opgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TalFraFil {
    public static void main(String[] args) {
        int[] talArray = new int[5];

        while (true) {
            try {
                System.out.println("Hvilken text fil vil du åbne? (Husk .txt):");
                Scanner sc = new Scanner(System.in);
                File file = new File(sc.nextLine());
                Scanner scf = new Scanner(file);
                int i = 0;
                while (scf.hasNextLine()) {
                    talArray[i] = Integer.parseInt(scf.nextLine());
                    i++;
                }

                System.out.println("Talene fra filen er:");
                for (int t : talArray) {
                    System.out.println(t);
                }
                scf.close();
                sc.close();
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Filen findes ikke! Prøv igen");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Filen indehoder for mange tal!");
            } catch (NumberFormatException e) {
                System.out.println("Filen indeholder ikke tal!");
            }
        }


        // Læs tal fra fil "tal.txt" med Scanner
        // Gem tallene i talArray
        // Håndter følgende exceptions med separate catch-blokke:
        // - FileNotFoundException
        // - ArrayIndexOutOfBoundsException (hvis filen har for mange tal)
        // - NumberFormatException (hvis filen indeholder ikke-tal)
    }
}
