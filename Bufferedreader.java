import java .io.*;
class Bufferedreader
 {
   public static void main(String args[])throws Exception
    {
      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      System.out.print("Enter your name: ");
      String name=br.readLine();
      System.out.println("");
      System.out.println("  Welcome "+name+"...!");
    }
 }