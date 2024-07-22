import java.util.Scanner;
public class Marks{
public static void main(String[] args)
{
  // int[] marks = {90,87,69,100,87};
	// 	  System.out.println("Length of array is:"+marks.length);
	// 	  System.out.println("Mark 1: "+marks[0]);
	// 	  System.out.println("Mark 2: "+marks[1]);
	// 	  System.out.println("Mark 3: "+marks[2]);
	// 	  System.out.println("Mark 4: "+marks[3]);
	// 	  System.out.println("Mark 5: "+marks[4]);
Scanner sc = new Scanner(System.in);
System.out.println("Enter Count");
int no_of_sub=sc.nextInt();
int[] marks=new int[no_of_sub];

int total = 0;
    for(int i = 0; i<marks.length; i++)
      {
      System.out.println("Enter Mark: ");
      marks[i] = sc.nextInt();
      //total = total + marks[i];
      total+=marks[i];
      }
    System.out.println("Total mark is: " + total);
    System.out.println("Percentage is: " + total/marks.length);
    if(total>450)
      System.out.println("A Grade");
    else if(total>350)
      System.out.println("B Grade");
    else
      System.out.println("c Grade");
  
     
}

}