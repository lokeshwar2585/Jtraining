import java.io.*;
class Typecasting
 {
   public static void main(String args[])
    {
      int i=10;
      long l=i;
      double d=l;
      System.out.println(" ");
      System.out.println("----Widening Typecasting----");
      System.out.println(" ");
      System.out.println(" Integer : "+i);
      System.out.println(" Long    : "+l);
      System.out.println(" Double  : "+d);
      System.out.println(" ");
      System.out.println("----Narrowing Typecasting----");
      double i2=100.245;
      short j=(short)i2;
      byte k=(byte)j;
      System.out.println(" ");
      System.out.println(" double value before changing :"+i2);
      System.out.println(" After typecasting to short   :"+j);
      System.out.println(" After typecasting to byte    :"+k);
    }
 }
      
      