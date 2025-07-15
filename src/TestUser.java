public class TestUser {

    // We only need one `main` method when we are working with 2 classes
    public static void main(String[] args) {

        // Here we are creating a new instance of the class User with the name user
        User user = new User();

        // Here we are setting string to the properties of this Class
        user.firstName = "Tiberius";
        user.lastName = "Dourado";

        // Now we are invoking the method `getFullName` in the new instance
        user.getFullName();
    }
}
