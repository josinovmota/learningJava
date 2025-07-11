public class DeclareVariable {
    // `final` means that this variable is immutable. We usually use it when we won't change the variable value
    final double pi = 3.14;
    final double e = 2.71828;

    // In this case, this variable will change a lot, since it'll be increased by 1 everytime. So, using final prefix is not good here
    int count = 0;
    int uses = 0;

    // We can use the prefix `private` but it'll require a `Getter` and `Setter` in order to access and change the variable values
    private int guilhermeAge = 23;
    private int jeremiasAge = 33;

    public static void main(String[] args) {

    }
}
