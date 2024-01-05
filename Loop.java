import java.io.*;
class Loop
 {
  public static void main(String args[])
   {
    for(int i=0;i<=100;i++)
     {
      System.out.print(i+",");
     }
    System.out.println("\n");
    int j=0;
    while(j<=100)
     {
      System.out.print(j+",");
      j+=5;
     }
    System.out.println("\n");
    int k=100;
    do{
      System.out.print(k+",");
      k-=5;
     }while(k>0);
   }
 }