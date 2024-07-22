package javacodes.ABCPAttern;
class Abcpattern
{
    // downside pattern
    public static void main(String[] args)
    {
        char row,col;
        for(row='C'; row>='A'; row--)
        {
            for(col='C'; col>=row; col--)
            {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
// normal pattern
// for(row='A'; row<='C'; row++)
// {
//    for(col='A'; col<=row; col++)
//    {
//        System.out.print(row);
//    }
//    System.out.println();
// }