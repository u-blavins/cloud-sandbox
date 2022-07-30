package basics;

/**
 * Absolute numbers without decimals
 * ---------------------------------
 * byte - shortest, store between -128 -> 127, saves memory
 * short - bigger than byte, -32000 - 32000
 * int - bigger than short
 * long - bigger than int
 *
 * Decimal numbers
 * ---------------------------------
 * float - smaller sized precision value
 * double - bigger precision value
 *
 * boolean - true or valse
 * char - stores characters - uses 16 bit to store value (unicode representation - across platforms)
 */

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        char a = 'A';
        byte b = 2;
        short c = 22;
        int d = 45;
        float e = 5.12345f;
        double f = 4.6354525235325d;
        boolean g = true;
        System.out.println("char: " + a);
        System.out.println("byte: " + b);
        System.out.println("short: " + c);
        System.out.println("int: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("boolean: " + g);
    }
}