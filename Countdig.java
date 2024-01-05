import java.util.Scanner;
class Countdig
 {
   public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int i, count=0;
      for(i=0;i<=str.length()-1;i++)
         {
           if(str.charAt(i)!='a'&&str.charAt(i)!='A'&&str.charAt(i)!='e'&&str.charAt(i)!='E'&&str.charAt(i)!='i'&&str.charAt(i)!='I'&&str.charAt(i)!='o'&&str.charAt(i)!='O'&&str.charAt(i)!='u'&&str.charAt(i)!='U')
             {
               count++;
             }
          }
       System.out.println("Number ov vowels in "+str+" are : "+count);
    }
 }
    