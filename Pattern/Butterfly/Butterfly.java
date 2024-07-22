import java.util.Scanner;  // Import the Scanner class

public class Butterfly {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        
        // Read input from the user
        System.out.print("Enter the number of rows: ");
        int x = scanner.nextInt();  // Read the number of rows
        
        int spaces = 2 * x - 2;
        
        // Print the upper part of the butterfly
        for (int i = 1; i <= x; i++) {
            // Print stars on the left side
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Print stars on the right side
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces -= 2;
        }
        
        spaces = 0;
        
        // Print the lower part of the butterfly
        for (int i = x; i > 0; i--) {
            // Print stars on the left side
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Print stars on the right side
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces += 2;
        }
        
        scanner.close();  // Close the scanner
    }
}
