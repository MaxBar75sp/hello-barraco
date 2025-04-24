import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiediamo il nome
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Chiamiamo la funzione printName che stampa il nome 3 volte
        printName(name);

        // Chiediamo la data di nascita
        System.out.print("Enter your birth date (DD/MM/YYYY): ");
        String birthDate = scanner.nextLine();

        // Stampiamo la data di nascita
        System.out.println("Your birth date is: " + birthDate);

        // Chiediamo che squadra tifi
        System.out.print("Which football team do you support? ");
        String team = scanner.nextLine();

        // Risposta con "Forza" e il nome della squadra
        System.out.println("Forza " + team + "!");

        // Chiudiamo lo scanner
        scanner.close();
    }

    // Funzione che stampa il nome 3 volte:
    public static void printName(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, " + name + "!");
        }
    }
}
