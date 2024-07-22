package javacodes.leftangletriangle;
public class Left
{
    public static void main(String[] args)
    {
        char row,col;
        for ( row = 'E'; row >= 'A'; row--) {
    
            for ( col = 'A'; col<=row; col++) {
                System.out.print(" ");
            }

            for ( col = 'E'; col >= row; col--) {
                System.out.print(col);
            }

            System.out.println();
        }       
    }
    
}