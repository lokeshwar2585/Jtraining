import java.io.*;
import java.util.Scanner;
class Arithop
 {
   public static void add(int a,int b)
   {
     System.out.println("  "+a+"+"+b+"="+(a+b));
   }
  public static void sub(int a,int b)
   {
     System.out.println("  "+a+"-"+b+"="+(a-b));
   }
  public static void mul(int a,int b)
   {
     System.out.println("  "+a+"x"+b+"="+(a*b));
   }
  public static void div(int a,int b)
   {
     if(b==0)
      {
       System.out.println("division by 0 error. Enter a different number");
      }
     else
      {
        System.out.println("  "+a+"/"+b+"="+((double)a/b));
      }
   }
  public static void mod(int a,int b)
   {
     System.out.println("  "+a+"%"+b+"="+(a%b));
   }
   public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a,b;
      char c;
      System.out.println("");
      System.out.println("  + - For addition");
      System.out.println("  - - For difference");
      System.out.println("  * - For multiplication");
      System.out.println("  / - For division");
      System.out.println("  % - For modulo");
      System.out.println("");
      System.out.print(" Enter the operator: ");
      c=s.next().charAt(0);
      System.out.println("");
      System.out.print(" Enter the first number: ");
      a=s.nextInt();
      System.out.println("");
      System.out.print(" Enter the second number: ");
      b=s.nextInt();
      System.out.println("");
      switch(c)
       { 
         case '+':{add(a,b);break;}
         case '-':{sub(a,b);break;}
         case '*':{mul(a,b);break;}
         case '/':{div(a,b);break;}
         case '%':{mod(a,b);break;}
         default: System.out.println("Enter a valid choice!");
      System.out.println("");
      
       }
    }
}
      

  