class Bword
{
    public static void main(String[] args)
    {
        for(int row=1;row<=9;row++)
        {
            for(int col=1;col<=9;col++)
            {
                if(col==1||row==1&&col<=8||row==1&&col<=6||row==5&&col<=8||col==9&&row>=6&&row<=8||col==9&&row>=2&&row<=4||row==9&&col<=8)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
