import java.io.*;
class A
 {
   private String clgname;
   private String clgaddr;
   private int ay_start;
   private int ay_end;
   private int id;
   private String stname;
   private String coursename;
   private String aadhar;
   public void setClgname(String clgname)
     {
          this.clgname=clgname;
     }
   public void setClgaddr(String clgaddr)
     {
          this.clgaddr=clgaddr;
     }
   public void setAystart(int ay_start)
     {
          this.ay_start=ay_start;
     }
   public void setAyend(int ay_end)
     {
          this.ay_end=ay_end;
     }
   public void setId(int id)
     {
          this.id=id;
     }
   public void setStname(String stname)
     {
          this.stname=stname;
     }
   public void setCoursename(String coursename)
     {
          this.coursename=coursename;
     }
   public void setAadhar(String aadhar)
     {
          this.aadhar=aadhar;
     }
   public String getClgname()
     {
          return this.clgname;
     }
   public String getClgaddr()
     {
          return this.clgaddr;
     }
   public int getAystart()
     {
          return this.ay_start;
     }
   public int getAyend()
     {
          return this.ay_end;
     }
   public int getId()
     {
          return this.id;
     }
   public String getStname()
     {
          return this.stname;
     }
   public String getCoursename()
     {
          return this.coursename;
     }
   public String getAadhar()
     {
          return this.aadhar;
     }
 }
class Setget
 {
   public static void main(String args[])
     {
       A s=new A();
       s.setClgname("MTIET");
       s.setClgaddr("palamaner");
       s.setAystart(2022);
       s.setAyend(2026);
       s.setId(503);
       s.setStname("Sai lokeshwar");
       s.setCoursename("CSE");
       s.setAadhar("2649 4082 3421");
       System.out.println(" ");
       System.out.println("  College Name        : "+ s.getClgname());
       System.out.println("  College Address     : "+ s.getClgaddr());
       System.out.println("  Academic year start : "+ s.getAystart());
       System.out.println("  Academic year end   : "+ s.getAyend());
       System.out.println("  Id                  : "+ s.getId());
       System.out.println("  Student Name        : "+ s.getStname());
       System.out.println("  Course name         : "+ s.getCoursename());
       System.out.println("  Aadhar number       : "+ s.getAadhar());
     }
 }
