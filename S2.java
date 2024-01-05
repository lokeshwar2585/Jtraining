class S2
{
 void m(S2 ob)
 {
  System.out.println("method is incvoked");
 }
 void p()
 {
  m(this);
 }
 public static void main(String args[])
 {
  S2 ob=new S2();
  ob.p();
 }
}