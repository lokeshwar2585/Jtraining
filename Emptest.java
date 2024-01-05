import java.io.*;
class Employee
{
  String name;
  int id;
  String dep;
  Employee(String name,int id,String dep)
   {
     this.name=name;
     this.id=id;
     this.dep=dep;
     System.out.println("  "+name+" "+id+" "+dep);
    }
}
class Emptest
{
  public static void main(String args[])
   {
     Employee e=new Employee("sai", 231,"cse");
   }
}
