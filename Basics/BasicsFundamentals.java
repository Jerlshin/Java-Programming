
import java.util.Scanner; // 'util' - sub-package within java that contains a collection of utility classes.

/*
 * => Primitive: Data types store the actual value directly in the memory location associated with the variable.
 *               When you assign a primitive value to another variable, a copy of the value is made. Changes to one variable do not affect the other.
 *              * int, double, char, boolean
 * => Reference: Data types, often called objects, store a memory address that points to the actual data. The data itself is stored elsewhere in memory.
 *               When you assign a reference value to another variable, you are copying the reference (memory address), not the actual object.
 *              * string, array, object
 */

 // ORDER OF OPERATION - P-E-MD-AS (left to right)
public class BasicsFundamentals {  // 'class' - keyword used to declare a class. 'main' - name of the class. 'public' - access modifier meaning the class is accessible from other classes.
    // main method - serves as the entry point for the program. 
    public static void main(String[] args) {  // 'public' - access modifier, 'static' - means the 'main' method belongs to the class itself, not to a specific instance of the class - Allows JVM to call the method without having to create an object of the 'main' class first
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); // 'nextLine()' - method of the Scanner class that reads a line of text input from the user.

        System.out.print("Enter you age: ");
        int age = scanner.nextInt();

        // likewise, you can use 'nextDouble()', 'nextBoolean()' etc. for other primitive data types.

        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        scanner.close(); // Close the scanner to prevent resource leaks.

        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        // Calling the functions
        printing();
    }

    /*
     * PRINTING
     */

    public static void printing() {
        System.out.print("Hello, "); // 'print()' - prints text to the console without a newline at the end.
        System.out.println("World!"); // 'println()' - prints text to the console followed by a newline.
        System.out.printf("Hello, %s! You are %d years old.%n", "Alice", 30); // 'printf()' - allows formatted output. '%s' is a placeholder for a string, '%d' for an integer, and '%n' for a newline.

    }

    
}