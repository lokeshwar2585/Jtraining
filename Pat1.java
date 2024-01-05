import java.io.*;
import java.util.Scanner;
class Pat1
 {
   static void printline(char c,int n)
    { 
      int i=1;
      System.out.println("");
      while(i<=n)
       {
         System.out.print(" "+c); 
         i++;
       }
    }
   static void printrevpat(char c, int n)
    {
      int i=n-1;
      while(i>=1)
       {
         printline(c,i);
         i--;
       }
    }
  static void printpat(char c, int n)
   {
    for(int i=0;i<n;i++)
     {
       printline(c,i);
     }
   }
   public static void main(String args[])
    {
     int n,x,y;
     char c;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     c=s.next().charAt(0);
     if(n%2==0) x=y=n/2;
     else x=n/2;y=n/2+1;
     printpat(c,x);
     printrevpat(c,y);
     System.out.println("");
   }
 }
           
     
     