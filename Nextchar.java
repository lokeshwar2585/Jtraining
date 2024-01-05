import java.io.*;
import java.util.Scanner;
class Nextchar
{
 public static void main(String args[])
  {
   String s,r="";
   int n=0;
   char c;
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   for(int i=0;i<s.length();i++)
    {
     if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u')
      {
        r=r+s.charAt(i);
      }
     else
      {
       if((s.charAt(i)>='a'&&s.charAt(i)<'z')||(s.charAt(i)>='A'&&s.charAt(i)<'Z'))
        {
         n=s.charAt(i);
         n+=1;
         c=(char)n;
         r=r+c;
        }
       else if(s.charAt(i)==' '){r=r+' ';}
       else
        {
          if(s.charAt(i)=='z'){r=r+'a';}
          if(s.charAt(i)=='Z'){r=r+'A';}
        }
      }
    }
   System.out.println(r);
  }
}