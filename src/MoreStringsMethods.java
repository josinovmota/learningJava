public class MoreStringsMethods {

    public static void main(String[] args) {
        // Here we have a phrase that will be used as an example
        String phrase = "  I love MY wife  ";

        // String class has 2 methods that can make the string lowercase or uppercase.
        // It's good to know that this method don't change the value of the string
        // variable
        System.out.println(phrase.toLowerCase());
        System.out.println(phrase.toUpperCase());

        // Also we have the `strip` method that removes the whitespaces and special characters
        // like \n \t from the beginning and the end of the string variable
        System.out.println(phrase.strip());

        // We also have the method `substring()` that receives 2 int as arguments and returns out
        // the string characters from the first index to the second index. It's good to know that
        // this range is not inclusive
        System.out.println(phrase.substring(4, 8));
    }
}
