import java.io.*;
import java.util.Scanner;
class Countv
 {  
   static boolean checkDigit(char c)
     {
       if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
         {
           return true;
         }
       else
         {
           return false;
         } 
      }
   public static void main(String args[])
     {
      String str;
      int count=0;
      Scanner s=new Scanner(System.in);
      System.out.println("");
      System.out.print("Enter a String: ");
      str=s.nextLine();
      System.out.println("");
      for(int i=0;i<str.length();i++)
       {
         if(checkDigit(str.charAt(i)))
          {
           count++;
          }
       }
      System.out.println("");
      System.out.println("  Number of vowels= "+count);
     }
  }
    