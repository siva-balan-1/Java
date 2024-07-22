class Rev
{
    public static void main(String[] args) 
    {
        for (int row = 1; row <= 4; row++) 
        {
            // Print leading spaces
            for (int col = 1; col <= 4 - row; col++) 
            {
                System.out.print("  "); // Two spaces for alignment
            }
            // Print numbers
            int number = 5-row;
            for (int col = 1; col <=2*row -1; col++) 
            {
                System.out.print(number+" ");
            }
            System.out.println(" ");
        }
    }
}