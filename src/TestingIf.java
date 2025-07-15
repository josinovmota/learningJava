import java.util.Scanner;

public class TestingIf {

    public static void main(String[] args) {
        // We ask user a number so we can try to guess it
        System.out.println("What is the number?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // This is a dumb if/elif/else just with the purpose of testing it
        if(number == 10) {
            System.out.println("O seu número é o 10");
        } else if (number == 20) {
            System.out.println("O seu número é o 20");
        } else {
            System.out.println("Eu não sei o seu número :(");
        }
    }
}
