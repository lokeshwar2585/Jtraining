import java.io.*;
class  Cons
{
 Cons(int a,int b)
  {
   System.out.println(a+b);
  }
 Cons(int a,int b,int c)
  {
   System.out.println(a+b+c);
  }
 public static void main(String args[])
 {
  Cons c1=new Cons(1,2);
  Cons c2=new Cons(1,2,3);
 }
}