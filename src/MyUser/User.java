package MyUser;

public class User {
    // Here we are creating 2 properties and making it public so other class can change its value
    public String firstName;
    public String lastName;

    // Here we are creating a method named `getFullName` that returns the firstName and secondName
    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }
}
