import java.io.*;
import java.util.Scanner;
class Sumdig
{
 public static void main(String args[])
  {
   int a,sum=0;
   Scanner s=new Scanner(System.in);
   System.out.println("");
   System.out.print(" Enter a number: ");
   a=s.nextInt();
   int temp=a;
   while(temp!=0)
   {
    sum=sum+temp%10;
    temp=temp/10;
   }
   System.out.println(" Sum of digits : "+sum);
  }
}