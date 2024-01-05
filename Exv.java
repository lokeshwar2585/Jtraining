import java.io.*;
import java.util.Scanner;
class Exv
{
 public static void main(String args[])
  {
   String s,r="";
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   for(int i=0;i<s.length();i++)
    {
     if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u')
      {
        r=r+s.charAt(i);
      }
    }
   System.out.println(r);
  }
}