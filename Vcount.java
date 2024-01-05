import java.io.*;
import java.util.Scanner;
class Vcount
{
 public static void main(String args[])
  {
   String s,r="";
   int c=0;
   Scanner sc=new Scanner(System.in);
   s=sc.nextLine();
   for(int i=0;i<s.length();i++)
    {
     if(s.charAt(i)=='A'||s.charAt(i)=='a')
      {
        r=r+"1";
        c+=1;
      }
     else if(s.charAt(i)=='E'||s.charAt(i)=='e')
      {
        r=r+"2";
        c+=2;
      }
     else if(s.charAt(i)=='I'||s.charAt(i)=='i')
      {
        r=r+"3";
        c+=3;
      }
     else if(s.charAt(i)=='O'||s.charAt(i)=='o')
      {
        r=r+"4";
        c+=4;
      }
     else if(s.charAt(i)=='O'||s.charAt(i)=='o')
      {
        r=r+"4";
        c+=4;
      }
     else if(s.charAt(i)=='U'||s.charAt(i)=='u')
      {
        r=r+"5";
        c+=5;
      }  
     else
      {
       r=r+s.charAt(i);
      }
    }
   System.out.println(r);
   System.out.println(c);
  }
}