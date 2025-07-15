public class StringsClass {

    public static void main(String[] args) {
        // There's two forms of concatenating strings and variables
        // In this example we use the + operator
        String phrase = "Loves cats";
        System.out.println("Jeremias " + phrase);

        // In this example we use the method `format` of the String class who read the `%s` in the string and
        // swap it with the other argument passed. It's good to know that the method `format` has a way more
        // uses than just concatenating Strings
        System.out.println(String.format("Jeremias %s", phrase));
    }
}
