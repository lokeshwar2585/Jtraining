class Statc
{
 int rn;
 String name;
 static String clg="MTI";
 Statc(int r, String n)
 {
  rn=r;
  name=n;
 }
 void display()
 {
  System.out.println(rn+" "+name+" "+clg);
 }
 public static void main(String args[])
 {
  Statc s=new Statc(503,"sai");
  s.display();
 }
}