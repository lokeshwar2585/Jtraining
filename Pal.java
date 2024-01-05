import java.io.*;
import java.util.Scanner;
class Pal
{
 public static void main(String args[])
  {
   int a,rev=0;
   Scanner s=new Scanner(System.in);
   System.out.println("");
   System.out.print(" Enter a number: ");
   a=s.nextInt();
   int temp=a;
   while(temp!=0)
    {
     rev=(rev*10)+temp%10;
     temp=temp/10;
    }
   if(a==rev)
   System.out.println(" "+a+" is a palindrome");
   else {System.out.println(" "+a+" is not a palindrome");}
  }
}