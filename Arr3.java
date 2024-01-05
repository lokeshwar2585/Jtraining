import java.io.*;
import java.util.Scanner;
class Arsort
{
 public static void main(String args[])
 {
   int n,i,j,k;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number of elements:"); 
   n=s.nextInt();
   int a[]=new int[n];
   for(i=0;i<n;i++)
   {
    a[i]=s.nextInt();
   }
   for(i=0;i<a.length;i++)
    {
     for(j=i+1;j<a.length;j++)
      {
       temp=0;
       if(a[i]<a[j])
        {
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
        }
      }
    }
   for(k=0;k<a.length;k++)
    {
     System.out.printl(a[k]+",");
    }
 }
}