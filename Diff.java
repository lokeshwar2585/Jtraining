import java.io.*;
import java.util.Scanner;
class Diff
 {
  public static void main(String args[])
   {
     int a,b;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     b=s.nextInt();
     if(a>b){System.out.println((a-b));}
     else{System.out.println((b-a));}
   }
}