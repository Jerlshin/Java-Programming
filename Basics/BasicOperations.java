import java.util.Random;

public class BasicOperations {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random(); // The object of Random

        // Generate two random integers between 1 and 100
        int num1 = random.nextInt(100) + 1; // nextInt(100) generates a number between 0-99, so we add 1 to shift the range to 1-100
        int num2 = random.nextInt(100) + 1;

        int number1 = random.nextInt(1, 7); // Generates a number between 1 (inclusive) and 7 (exclusive), simulating a dice roll
        System.out.println("Dice Roll: " + number1);

        // You can use .nextDouble(), .nextBoolean(), etc. for other types of random values.

        // Perform basic arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2; // Cast to double for accurate division

        // Display the results
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.printf("Quotient: %.2f%n", quotient); // Format to 2 decimal places

        /*
         * MATH
         */
        double sqrtNum1 = Math.sqrt(num1);
        double power = Math.pow(num1, 2); // num1 raised to the power of 2
        double max = Math.max(num1, num2);
        double min = Math.min(num1, num2);
        double rounded = Math.round(quotient); // Rounds to the nearest whole number
        double ceil = Math.ceil(quotient); // Rounds up to the nearest whole number
        double floor = Math.floor(quotient); // Rounds down to the nearest whole number
        double randomValue = Math.random(); // Generates a random double between 0.0 and 1.0

        System.out.printf("Square root of Number 1: %.2f%n", sqrtNum1);
        System.out.printf("Number 1 raised to the power of 2: %.2f%n", power);
        System.out.println("Maximum of Number 1 and Number 2: " + max);
        System.out.println("Minimum of Number 1 and Number 2: " + min);
        System.out.println("Rounded Quotient: " + rounded); 
        System.out.println("Ceiling of Quotient: " + ceil);
        System.out.println("Floor of Quotient: " + floor);
        System.out.printf("Random value between 0.0 and 1.0: %.2f%n", randomValue);

        System.out.println(Math.PI); // PI constant
        System.out.println(Math.E);  // Euler's numbe
        System.out.println(Math.abs(-10)); // Absolute value        
    }    
}
