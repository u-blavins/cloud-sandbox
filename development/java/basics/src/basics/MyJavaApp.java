package basics;

/**
 * Step 1: Create a new package
 * - Create a package to put all java code into. Java package is a
 * directory to place Java files.
 * Step 2: Create a Class
 * - Usually name classes in Camel Case syntax
 *
 * To execute a Java program, need to send a Signal to JVM on where
 * to start executing a program.
 *
 * In Java, all instructions (code) are within a Class. Class groups
 * data and instructions together. Thus contains variables and methods.
 *
 * It is recommended to place Java code in a package.
 *
 * A Java program starts by executing the main method of some class. A
 * method is a set of instructions that can be executed as if they were
 * a single operation.
 *
 * Running the main() method:
 * You call the `java` command that comes with the JRE, and it tells what
 * Java class to run, and what arguments to pass through.
 *
 * Important:
 * If only a single class in a Java program contains a main() method, then
 * it is referred to as the main() class.
 *
 * Can have many classes with a main() method in a project, but JVM can only
 * be instructed to run one at a time.
 */

public class MyJavaApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
