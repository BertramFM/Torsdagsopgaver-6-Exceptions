package opgave1;

public class ArrayFejl {
    public static void printTreForsteElementer(String[] array) {

        try {
            System.out.println("Første element: " + array[0]);
            System.out.println("Andet element: " + array[1]);
            System.out.println("Tredje element: " + array[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fejl! Kan ikke hente elementer fra arrayet der ikke findes");
        }
    }

    public static void main(String[] args) {
        String[] navne1 = {"Anna", "Bob", "Clara", "David"};
        String[] navne2 = {"Eva", "Frank"};

        printTreForsteElementer(navne1);
        System.out.println();
        printTreForsteElementer(navne2);
    }
}

