import java.io.*;
import java.util.Scanner;
class m1p1
{
 public static void main(String args[])
  {
   String s,r="";
   int n=0,k=0;
   char c;
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   for(int i=0;i<s.length();i++)
    { 
      if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))
       {
        if(k%2==0)
         {
           if(s.charAt(i)=='a'){r=r+'z';k++;}
           else if(s.charAt(i)=='A'){r=r+'Z';k++;}
           else
            {
              n=s.charAt(i);
              n-=1;
              c=(char)n;
              r=r+c;
              k++;
            }
          }
         else
          {
           n=s.charAt(i);
           n+=1;
           c=(char)n;
           r=r+c;
           k++;
          }
        }
       else
        {
          r=r+s.charAt(i);
        }
      }
   System.out.println(r);
  }
}