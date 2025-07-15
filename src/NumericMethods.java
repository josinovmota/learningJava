public class NumericMethods {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        // The class Integer has a method `max` that receives as arguments two integers and returns the greater of this two integers
        System.out.println(Integer.max(a, b));

        // In the class Integer we can also take a String as an argument of the method `parseInt` and it'll return the string as its decimal
        // representation
        String c = "1234";
        int d = Integer.parseInt(c);
        System.out.println(d);

    }
}
