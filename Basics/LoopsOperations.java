public class LoopsOperations {

    static int x = 3; // global variable

    public static void main(String[] args) {

        int x = 1; // Local variable
        System.out.println(x);

        // Java uses the LOCAL variables first, and then, the GLOBAL variables
        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);

        // Break and Continue
        System.out.println("\nBreak and Continue:");
        for (int m = 1; m <= 10; m++) {
            if (m == 6) {
                System.out.println("Breaking the loop at iteration " + m);
                break; // Exit the loop when m is 6
            }
            if (m % 2 == 0) {
                System.out.println("Skipping even iteration " + m);
                continue; // Skip even numbers
            }
            System.out.println("Processing iteration " + m);
        }

        // call string operations
        string_operations();
        sub_string_operations();

        // operations
        ternary_operations();
        switch_operations();
        operators();

        /*
         * Methods - piece of code that can be called to execute with ()
         * Overloaded Methods - methods that share the same name, but different parameters signatures
         */
    }

    public static void string_operations() {
        String name = "Jerlshin";

        System.out.println("Original Name: " + name); // Prints the original string
        System.out.println("Length of the string: " + name.length()); // Prints the length of the string
        System.out.println("First character: " + name.charAt(0)); // Prints the first character of the string
        System.out.println("Uppercase Name: " + name.toUpperCase()); // Prints the string in uppercase
        System.out.println("Lowercase Name: " + name.toLowerCase()); // Prints the string in lowercase
        System.out.println("Substring (0 to 4): " + name.substring(0, 4)); // Prints the substring from index 0 to 4
        System.out.println("Contains 'shin': " + name.contains("shin")); // Checks and prints if the string contains "shin"
        System.out.println("Index of 's': " + name.indexOf('s')); // Prints the index of the first occurrence of 's'
        System.out.println("Last Index of 's': " + name.lastIndexOf('s')); // Prints the last index of 's'
        System.out.println("Replaced Name: " + name.replace("Jerl", "John")); // Replaces "Jerl" with "John" and prints the modified string
        System.out.println("Trimmed Name: " + "  Jerlshin  ".trim()); // Trims leading and trailing spaces and prints the result
        System.out.println("Split Name by 's': " + String.join(", ", name.split("s"))); // Splits the string by 's', joins with ", ", and prints
        System.out.println("Concatenated Name: " + name.concat(" is learning Java.")); // Concatenates the string with " is learning Java." and prints

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        // Checking if two strings are equal
        System.out.println("Name is equal (T/F): " + name.equals("Jerlfrin"));

    }

    public static void sub_string_operations() {
        String email = "jerlshin@gmail.com";
        // String username = email.substring(0, 9);
        // String domain = email.substring(9); // Takes everything after the given index

        // Advanced
        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@')+1);

        System.out.println("Username " + username);
        System.out.println("Domain " + domain);

    }

    public static void ternary_operations() {
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 65;

        String passOrFail = (score >= 70) ? "Pass" : "Fail";

        System.out.println("Pass / Fail: " + passOrFail);
    }

    public static void switch_operations() {

        String day = "Monday";

        switch(day){
            // single case
            case "Monday" -> System.out.println("It is a weekday");
            
            // multiple cases
            case "Tuesday", "Wednesday", "Thursday", "Friday" ->  System.out.println("It is a weekday");
            
            // default
            default -> System.out.println("It is a damn day");
        }
    }

    public static void operators() {
        // '&&' = AND
        // '||' = OR
        // '!' = NOT

        double temp = 40;
        boolean isSunny = true;

        System.out.println(temp<=30 && temp >= 0);
        System.out.println(temp<=30 || temp >=0 && !isSunny);

    }
}
