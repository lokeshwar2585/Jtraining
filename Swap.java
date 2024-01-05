import java.io.*;
import java.util.Scanner;
class Swap
 {
   static void swp(int a, int b)
    {
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("  a="+a);
      System.out.println("  b="+b);
    }
   public static void main(String args[])
    {
     int a,b;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     b=s.nextInt();
     System.out.println(" values before swapping");
     System.out.println("  a="+a);
     System.out.println("  b="+b);
     System.out.println(" values after swapping");
     swp(a,b);
    }
 }
      