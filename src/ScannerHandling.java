import java.util.Scanner;

public class ScannerHandling {

    public static void main(String[] args) {
        //  Declare and initialize a new instance of the class Scanner
        Scanner scanner = new Scanner(System.in);

        // Receive a Name and stores it in the variable `name` then prints its value
        System.out.println("Qual é o seu nome? ");
        String name = scanner.nextLine();
        System.out.println(name);

        // Receive an Age and stores it in the variable `age` then prints its value
        System.out.println("Quantos anos você tem?");
        int age = scanner.nextInt();
        System.out.println(age);
    }
}
