import java.io.*;
import java.util.Scanner;
class Prime
{
 public static void main(String args[])
  {
   int i,count=0;
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   for( i=1;i<=a;i++)
    {
      if(a%i==0)
       {
        System.out.print(i);
        if(i!=a){System.out.print(",");}
        count++;
       }    
    }
   System.out.println("");
   System.out.println("Number of factors of "+a+" : "+count);
   if(count==2)
    {
     System.out.println(a+ " is a prime number");
    }
    else if(a==1)
    {
      System.out.println(a+ " is neither a prime nor composite");
    }
   else
    {
      System.out.println(a+ " is not a prime number");
    }
  }
}