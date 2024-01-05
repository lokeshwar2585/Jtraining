import java.io.*;
import java.util.Scanner;
class Counts
 {  
   static boolean checkSp(char c)
     {
          if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
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
         if(checkSp(str.charAt(i)))
          {
            count++;
          }
       }
      System.out.println("");
      System.out.println("  Number of Special characters = "+count);
     }
  }
    