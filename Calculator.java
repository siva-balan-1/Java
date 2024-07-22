public class Calculator
  {
    public static void main(String[] args)
     {
      Calculator calc = new Calculator();
      int result = calc.add(5,6); 
      int res = calc.sub(6,6);
        System.out.println("Addition valuse is: " + result);
        System.out.println("Addition valuse is: " + res);
     }
    int add(int a, int b) 
     {
        int c = a+b;
//System.out.println("Addition valuse is: " + c);
return c;
     }
int sub(int d ,int  e)
{
int f = d-e;
return f;
}
     
  }