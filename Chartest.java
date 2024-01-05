import java.util.Scanner;
class Chartest
{
  static void test(char c)
  {
    if((c>='A' && c<='Z')||(c>='a' && c<='z'))
       {
         System.out.println("YES");
        }
    else
       {
         System.out.println("NO");
       }
   }
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
char c=s.next().charAt(0);
test(c);
}
}