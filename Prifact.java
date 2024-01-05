import java.io.*;
import java.util.Scanner;
class Prifact
{ 
 static void fact(int a)
  {
   int[] c=new int[20];
   int i=-1,count=0;
   for(int j=1;j<=a;j++)
    {
      if(a%j==0)
       {
         i++;
         c[i]=j;
       }  
    }
   for(int k=0;k<=i;k++)
    {
      for(int l=0;l<=i;l++)
      {
        if(c[l]%i==0)
        {
        count++;
        }
      }
      if(count==2)
      System.out.println(c[k]);
     }
  }
 public static void main(String args[])
  {
   int i,k;
   boolean c;
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   fact(a);
  }
}