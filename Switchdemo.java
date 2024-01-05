import java.io.*;
import java.util.*;
class Switchdemo
 {
   public static void main(String args[])
     {
       Scanner s = new Scanner(System.in);
       int a = s.nextInt();
       System.out.println(printDay(a));
     }
  public static String printDay(int dayno)
     {
       String day;
       switch(dayno)
         {
           case 0:{day="SUNDAY";break;}
           case 1:{day="MONDAY;break;}
           case 2:{day="TUESDAY";break;}
           case 3:{day="WEDNESDAY";break;}
           case 4:{day="THURSDAY";break;}
           case 5:{day="FRIDAY";break;}
           case 6:{day="SATURDAY";break;}
           default: day="INVALID";   
         } 
       return day;
    }
}