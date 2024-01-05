import java.util.Scanner;
class Arithfun
 {
   public static double div(int a, int b)
     {
       double c= a/(double)b;
       return c;
      }
   public static int add(int a, int b)
     {
       int c= a+b;
       return c;
      }
   public static void main(String args[])
     {
       int a,b;
       Scanner s=new Scanner(System.in);
       System.out.print("Enter first number : ");
       a=s.nextInt();
       System.out.println(" ");
       System.out.print("Enter second number : ");
       b=s.nextInt();
       System.out.println(" ");
       System.out.println(a+"+"+b+" = "+add(a,b));
       System.out.println(a+"/"+b+" = "+div(a,b));
     }
 }