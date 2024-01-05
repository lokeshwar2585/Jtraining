import java.io.*;
import java.util.Scanner;
class Armstr
{
 static void arm(int a, int len)
  {
   int t=0;
   int b=a;
   while(b!=0)
   {
    t=t+(int)Math.pow((b%10),len);
    b/=10;
   }
   if(t==a)
   System.out.println(a+" is an armstrong number");
   else
   System.out.println(a+" is not an armstrong number");
  }
 public static void main(String args[])
  {
   int a,b,l=0;
   Scanner s=new Scanner(System.in);
   a=s.nextInt();
   b=a;
   while(b!=0)
   {
    l++;
    b/=10;
   }
   arm(a,l);
  }
 }
