// public class Duplicate {

//   public static void main(String[] args) {
//     //Frequency of Each Element in a given array
//       String s = "ayyappan";
//       char[] name = s.toCharArray();
//   for(int j = 0; j<name.length; j++)
//   {
//       char ch = name[j]; //a
//       int count = 1;
//     for(int i=j+1; i<name.length;i++) 
//     {
//       if(name[i]!='*') 
//       {
//         if(name[i]== ch)
//         {
//           name[i] = '*';
//           count++;
//         }
//       }
//       else
//         continue;
//     }
//     /*
//      * if(ch!='*') System.out.println(ch + " appears for "+ count + " times");
//      */
//   if(count!=1&&ch!='*')
//     System.out.println(ch + " is duplicate element in the array it appears "+ count + " times");
    
// }
//   }
// }
public class Duplicate{

  public static void main(String[] args) {
    //Frequency of Each Element in a given array
      int[]a = {1,2,3,5,1,5,20,2,12,10};
      
  for(int j = 0; j<a.length; j++)
  {
      int n = a[j]; 
      int count = 1;
    for(int i=j+1; i<a.length;i++) 
    {
      if(a[i]!=-1) 
      {
        if(a[i]== n)
        {
          a[i] = -1;
          count++;
        }
      }
      else
        continue;
    }
  
      if(n!=-1) 
        System.out.println(n + " appears for "+ count + " times");
      
           /*
       * if(count!=1&&n!=-1) System.out.println(n +
       * " is duplicate element in the array it appears "+ count + " times");
       */
}
  }
}