import java.io.*;
import java.util.Scanner;
class Even
 {
   public static void main(String args[])
     {
      int n;
      Scanner s=new Scanner(System.in);
      System.out.println("");
      System.out.print("Enter a number: ");
      n=s.nextInt();
      System.out.println("");
      if(n==0)
       {
         System.out.println("  "+n+" is neither EVEN nor ODD");
       }
      else if(n%2==0)
       {
         System.out.println("  "+n+" is EVEN");
       }
      else
       {
        System.out.println("  "+n+" is ODD");
       }
     }
 }
     
