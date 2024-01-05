import java.util.Scanner;
class Ifelse
{
  public static void main(String args[])
   {
     int i,j;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the first number: ");
     i=s.nextInt();
     System.out.println("Enter the second number: ");
     j=s.nextInt();
     if(j==0)
      {
        System.out.println("Division by 0 error");
      }
     else 
      {
        System.out.println(i+" divided by "+j+" is "+(i/j));
      }
     i=i+j;
   } 
}     
