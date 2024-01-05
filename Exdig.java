import java.io.*;
import java.util.Scanner;
class Exdig
{
 public static void main(String args[])
  {
   String s,r="";
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   for(int i=0;i<s.length();i++)
    {
     if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
      {
        r=r+s.charAt(i);
      }
    }
   System.out.println(r);
  }
}