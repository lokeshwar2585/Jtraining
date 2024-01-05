import java.io.*;
import java.util.Scanner;
class Alpha
 {
  public static void main(String args[])
   {
    char c;
    Scanner s=new Scanner(System.in);
    c=s.next().charAt(0);
    if((c>='a' && c<='z')||(c>='A' && c<='Z'))
      {
        System.out.println("YES");
       }
    else
      {
        System.out.println("NO");
       }
   }
 }
    