import java.io.*;
import java.util.Scanner;
class Si
{
 public static void main(String args[])
 {
  double p,t,r,s;
  Scanner sc=new Scanner(System.in);
  p=sc.nextDouble();
  t=sc.nextDouble();
  r=sc.nextDouble();
  s=p*t*r/100;
  System.out.println(s);
 }
}