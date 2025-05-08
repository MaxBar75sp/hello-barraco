import java.util.Scanner;
import java.util.Vector;

public class Hello {
    public static void main(String[] args) {
        // Messaggio iniziale
        System.out.println("Ciao Marco!");

        // Array di caratteri con le lettere del nome "marco"
        char[] lettereArray = {'m', 'a', 'r', 'c', 'o'};

        // Stampa le lettere dell'array
        for (char lettera : lettereArray) {
            System.out.print(lettera + " ");
        }
        System.out.println(); // A capo dopo la stampa

        // Parte aggiunta: stampa "Hello Fabio!" con Vector
        System.out.println("Hello Marco!");

        Vector<Character> lettere = new Vector<>();
        lettere.add('m');
        lettere.add('a');
        lettere.add('r');
        lettere.add('c');
        lettere.add('o');

        for (Character lettera : lettere) {
            System.out.println(lettera);
        }

        // Scanner per input utente
        Scanner scanner = new Scanner(System.in);

        // Chiediamo il nome
        System.out.print("Inserisci il tuo nome: ");
        String name = scanner.nextLine();

        // Stampa il nome 3 volte
        stampaNome(name);

        // Chiediamo la data di nascita
        System.out.print("Inserisci la tua data di nascita (GG/MM/AAAA): ");
        String birthDate = scanner.nextLine();

        // Stampiamo la data di nascita
        System.out.println("La tua data di nascita è: " + birthDate);

        // Chiediamo la squadra tifata
        System.out.print("Per quale squadra di calcio tifi? ");
        String team = scanner.nextLine();

        // Risposta tifosa
        System.out.println("Forza " + team + "!");

        // Chiudiamo lo scanner
        scanner.close();
    }

    // Funzione che stampa il nome 3 volte
    public static void stampaNome(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ciao, " + name + "!");
        }
    }
}
