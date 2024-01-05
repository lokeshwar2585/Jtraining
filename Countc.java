import java.io.*;
import java.util.Scanner;
class Countc
 {  
   static boolean checkCon(char c)
     {
          if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
           {
             return false;
           }
          else
           {
             return true;
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
         if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
          {
            if(checkCon(str.charAt(i)))
             {
              count++;
             }
          }
       }
      System.out.println("");
      System.out.println("  Number of consonents = "+count);
     }
  }
    