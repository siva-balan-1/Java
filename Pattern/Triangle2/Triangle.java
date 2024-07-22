public class Triangle{
    public static void main(String[] args){
        for(int row=1;row<=5;row++){
            for(int col=1;col<=6-row;col++){
                System.out.print(" ");
            }
            //int number = 2 * row - 1;
            for(int col=1;col<=2*row-1;col++){
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }

}