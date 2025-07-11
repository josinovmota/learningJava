import java.util.Scanner;

public class StringsHandling {

    public static void main(String[] args) {
        // Declare and initialize string variables
        String string = new String("Hello World!");
        String uau = "It's beautiful today";
        String mix = string + " " + uau;

        // Receive the cli argument
        String name = args[0];

        // Receive StdIn input and declare a variable with its value
        System.out.println("What's your name? ");
        Scanner scanner = new Scanner(System.in);
        String secondName = scanner.nextLine();

        // Declare and initialize fullMessage variable
        String fullMessage = "\n" + mix + ". Hello " + name + " and " + secondName;

        // Print the `fullMessage` variable
        System.out.println(fullMessage);
    }
}
