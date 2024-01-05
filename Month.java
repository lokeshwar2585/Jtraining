import java.io.*;
import java.util.Scanner;
class Month
 {
    static void test(int n)
     {    
           if(n== 1){System.out.println("  JANNUARY");}
           else if(n== 2){System.out.println("  FEBRUARY");}
           else if(n== 3){System.out.println("  MARCH");}
           else if(n== 4){System.out.println("  APRIL");}
           else if(n== 5){System.out.println("  MAY");}
           else if(n== 6){System.out.println("  JUNE");}
           else if(n== 7){System.out.println("  JULY");}
           else if(n== 8){System.out.println("  AUGUST");}
           else if(n== 9){System.out.println("  SEPTEMBER");}
           else if(n== 10){System.out.println("  OCTOBER");}
           else if(n== 11){System.out.println("  NOVEMBER");}
           else if(n== 12){System.out.println("  DECEMBER");}
           else{System.out.println("  Enter a valid choice! \n i.e, 1-12");}
     }
   public static void main(String args[])
    {
     int n;
     Scanner s=new Scanner(System.in);
     System.out.println("");
     System.out.println("Enter 1 for Jannuary");
     System.out.println("Enter 2 for February");
     System.out.println("Enter 3 for March");
     System.out.println("Enter 4 for April");
     System.out.println("Enter 5 for May");
     System.out.println("Enter 6 for June");
     System.out.println("Enter 7 for July");
     System.out.println("Enter 8 for August");
     System.out.println("Enter 9 for September");
     System.out.println("Enter 10 for October");
     System.out.println("Enter 11 for November");
     System.out.println("Enter 12 for December");
     System.out.println("");
     System.out.print(" Enter month number: ");
     n=s.nextInt();
     System.out.println("");
     test(n);
    }
 }
     
     
