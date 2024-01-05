import java.io.*;
import java.util.Scanner;
class Arr1
{
 public static void main(String args[])
 {
  int a[]={2,-9,0,5,12,25,22,9,8,12},k,sum=0;
  for(int b:a)
  {
   sum+=b;
  }
  System.out.println(" Sum of elements    : "+sum);
  double avg=(double)sum/a.length;
  System.out.println(" Average of elements: "+avg);
 }
}