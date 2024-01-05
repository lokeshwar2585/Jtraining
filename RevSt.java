import java.io.*;
import java.util.Scanner;
class RevSt
{
 public static void main(String args[])
  {
   String s,r="";
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   for(int i=s.length()-1;i>=0;i--)
    {
     r=r+s.charAt(i);
    }
   System.out.println(r);
  }
}