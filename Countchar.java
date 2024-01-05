import java.io.*;
import java.util.Scanner;
class Countchar
 {
   public static void main(String args[])
     {
      String str;
      char c;
      int count=0;
      Scanner s=new Scanner(System.in);
      System.out.println("");
      System.out.print("Enter a String: ");
      str=s.nextLine();
      System.out.println("");
      System.out.print("Enter the letter: ");
      c=s.next().charAt(0);
      for(int i=0;i<str.length();i++)
       {
         if(str.charAt(i)==c)
          {
           count++;
          }
       }
      System.out.println("");
      System.out.println("  "+c+" is repeated "+count+" times");
     }
  }
      
      