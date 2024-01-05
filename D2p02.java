import java.util.Scanner;
class D2p02
{
 public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    char c=s.next().charAt(0);
    if((c=='0')||(c=='1')||(c=='2')||(c=='3')||(c=='4')||(c=='5')||(c=='6')||(c=='7')||(c=='8')||(c=='9'))
      {
        System.out.println("YES");
       }
  }
}