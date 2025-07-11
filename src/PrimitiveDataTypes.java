public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Boolean data type can store 2 values. True (1) or False (0)
        boolean isBlue = false;

        // Char data type can store a single letter or ASCII Values
        char c = 'Z';

        // Short data type can store numeric values from -32768 to 32767
        short s = 32767;

        // Int data type has 32 bits and can store numeric values with a not too long range. The max number that int can store is ~2.15B
        int i = 512312345;

        // Double data type has 64 bits and can store numeric values with a very long range. The max number is ~9.2S
        // Since the compiler starts looking at the Number when you compile, you should use the letter "L" so the compiler identifies
        // this whole number as a long
        long l = 2143214582123L;

        // Float data type has 32 bits and can store fractional numbers. It has less precision than Double data type
        // Since the compiler starts looking at the Number, you should use the letter "F" so the compiler identifies it as a Float
        float f = 3.14F;

        // Double data type has 64 bits and have more precision than the Float data type
        // You can use double instead of float in 99% of cases. You should look to use Float instead of Double when you have to
        // create a program that must have minimum memory usage or things like that
        double d = 3.123124;
    }
}
