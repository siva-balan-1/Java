import java.util.Scanner;
public class SMin
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Count of Subjects:");
int count = sc.nextInt();
int[] marks=new int[count];

for(int i=0;i<marks.length;i++)
{
System.out.println("Enter Mark:");
marks[i]=sc.nextInt();
}
int min= marks[0],smin= marks[1];
for(int i=1;i>marks.length;i++)
{
if(marks[i]>min)
{
smin=min;
min=marks[i];
}
else if(marks[i]<smin)
{
smin=marks[i];
}
}
System.out.println("Min is:"+min);
System.out.println("Second Min is:"+smin);
}
}