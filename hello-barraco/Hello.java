import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();   
    //Richiamo la funzione printName che stampa il nome 3 volte
    printName(name);
    }
    //Funzione che stampa il nome 3 volte:
    public static void printName(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, " + name + "!");
        }
    }
}   
