package opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Hvilken text fil vil du åbne? (Husk at skrive filnavn med .txt):");
                Scanner sc = new Scanner(System.in);
                File file = new File(sc.nextLine());
                Scanner scf = new Scanner(file);
                while (scf.hasNextLine()) {
                    System.out.println(scf.nextLine());
                }
                scf.close();
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Filen findes ikke! Prøv igen");
            }
        }
    }
}
