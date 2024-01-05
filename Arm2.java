import java.io.*;
import java.util.Scanner;
class Arm2
{
 static void arm(int a)
  {
   int t=0;
   int b=a;
   while(b!=0)
   {
    t=t+(int)Math.pow((b%10),4);
    b/=10;
   }
   if(t==a)
   System.out.println(" "+ a);
  }
 public static void main(String args[])
  {
   System.out.println(" 4-digit Armstrong numbers are:");
   for(int i=1000;i<=9999;i++)
   {
    arm(i);
    }
  }
 }
