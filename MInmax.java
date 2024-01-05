import java.util.*;
class Minmax
 {
   public static void main(String args[])
     {
	Scanner Sc=new Scanner(System.in);
	int a=Sc.nextInt();
	int b=Sc.nextInt();
	int c=Sc.nextInt();
	 int min,max;
	if(a>b)
	 {
	   if(a>c) max=a;
           else max=c;
	 }
	else
	 { 
	   if(b>c) max=b;
	   else max=c;
	 }
        System.out.println("Maximum no is "+max);
         if(a<b)
	 {
	   if(a<c) min=a;
           else min=c;
	 }
	else
	 { 
	   if(b<c) min=b;
	   else min=c;
	 }
        System.out.println("Minimum no is: "+min);
     }
 }