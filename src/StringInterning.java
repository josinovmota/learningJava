public class StringInterning {

    public static void main(String[] args) {
        // Imagine that we have this comparison
        String a = "Pão";
        String b = new String("Pão");

        // Here we got the result "False", so the program is saying that `a` is not equal to `b`
        System.out.println("Comparação do a e b deu: " + (a == b));

        // Now, in this case, we have this comparison
        String c = "Macarrão";
        String d = "Macarrão";

        // Here we got the result "True", but as we thought, the variable C and D must have the different
        // memory location. Here's the deal, in java we have something called Interning. Interning does some
        // optimizations to our program that when we repeat something, like in the last case we had the word "Macarrão",
        // it'll address the same position in memory for those 2 variables
        System.out.println("Comparação do c e d deu: " + (c == d));

        // Now you understand that the == operator could be dangerous sometimes since he compares the memory address
        // In order to don't fall for this problem, we can use the method `equals()`. Let's see an example
        System.out.println("Comparação do a e b deu: " + a.equals(b));
    }
}
