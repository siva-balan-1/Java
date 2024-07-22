public class Rev {

    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            // Print leading spaces
            for (int col = 1; col <= 4 - row; col++) {
                System.out.print("  "); // Two spaces for alignment
            }
            // Print numbers
            int number = 2 * row - 1;
            for (int col = number; col >=1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}