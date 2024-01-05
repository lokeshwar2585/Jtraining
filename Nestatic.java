class Nestatic
{
 static int d=20;
 static class Inner
 {
  static void msg(){System.out.println(d);}
 }
 public static void main(String args[])
 {
  Nestatic.Inner.msg();
 }
}