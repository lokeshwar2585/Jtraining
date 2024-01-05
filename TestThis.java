class A
{
 A(){
    this(5);
    System.out.println("Default constructor");
   }
 A(int x){
 System.out.println(x);
 }
}
class TestThis
{
 public static void main(String args[])
 {
   A a=new A();
 }
}
 