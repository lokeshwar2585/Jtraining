import java.util.Scanner;
class This 
{
  int rn;
  String name;
  int fee;
  This(int rn,String name,int fee)
  {
    this.rn=rn;
    this.name=name;
    this.fee=fee; 
    System.out.println(rn);
    System.out.println(name);
    System.out.println(fee);
  }
  public static void main(String args[])
  {
   This a=new This(123,"sai",2000);
  }
}