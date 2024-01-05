class StaCh
{
 int rn;
 String name;
 static String clg="ITI";
 static void change()
 {
  clg="MTI";
 }
 StaCh(int r,String n)
 {
  rn=r;
  name=n;
 }
 void disp()
 {
  System.out.println(name+" "+rn+" "+clg);
 }
 public static void main(String args[])
 {
  StaCh s1=new StaCh(503,"sai");
  s1.disp();
  change();
  StaCh s2=new StaCh(503,"sai");
  s2.disp();
 }
}
  