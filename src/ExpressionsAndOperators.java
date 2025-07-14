public class ExpressionsAndOperators {
    public static void main(String[] args) {

        // You can't divide 2 Integers and expect them to result a Double. In this case, the result will be 2.0
        double a = 5 / 2;
        System.out.println(a);

        // As a rule of thumb, you can always turn the expression to the type you want it to return so you won't get errors
        double b = (double) 5 / (double) 2;
        System.out.println(b);

        // We have 2 shortcuts to increase or decrease an integer
        // In the first way we use the -- or ++ operand
        int c = 5;
        c++;
        System.out.println(c);
        c--;
        System.out.println(c);

        // In the second way we can use the -= += operand that also change the variable
        int d = 5;
        d += 1;
        System.out.println(d);
        d -= 1;
        System.out.println(d);
    }
}
