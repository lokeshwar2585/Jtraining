import java.io.*;
class Wrapper
 {
   public static void main(String args[])
    {
      byte a=10;
      short b=20;
      int c=30;
      long d=40;
      float e=50.0f;
      double f=60.0d;
      char g='a';
      boolean h=true;
      System.out.println("---Printing objecvt values---");
      Byte i=a;
      Short j=b;
      Integer k=c;
      Long l=d;
      Float m=e;
      Double n=f;
      Character o=g;
      Boolean p=h;
      System.out.println("Byte object: "+i);
      System.out.println("Short object: "+j);
      System.out.println("Integer object: "+k);
      System.out.println("Long object: "+l);
      System.out.println("Float object: "+m);
      System.out.println("Double object: "+n);
      System.out.println("Character object: "+o);
      System.out.println("Boolean object: "+p);
      byte bob=i;
      short sob=j;
      int iob=k;
      long lob=l;
      float fob=m;
      double dob=n;
      char cob=o;
      boolean boolob=p;
      System.out.println("----Printing primitive datatype values----");
      System.out.println("  byte value: "+bob);
      System.out.println("  short value: "+sob);
      System.out.println("  int value: "+iob);
      System.out.println("  long value: "+lob);
      System.out.println("  float value: "+fob);
      System.out.println("  double value: "+dob);
      System.out.println("  char value: "+cob);
      System.out.println("  boolean value: "+boolob);
    }
 }
