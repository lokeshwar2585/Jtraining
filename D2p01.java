import java.util.Scanner;
class D2p01
{
 public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    char c=s.next().charAt(0);
    if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U'))
      {
        System.out.println("YES");
      }
    else
      {
        System.out.println("NO");
     }
  }
}