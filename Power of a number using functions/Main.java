import java.util.Scanner;
class Main{
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  int b=in.nextInt();
  int p=in.nextInt();
  int val=power(b,p);
  System.out.print(val);
}
 public static int power(int a,int b)
 {
   if(a==1)
   return 1;
   if(b==1)
   return a;
   if(b==0)
    return 1; 
  int mul=1;
   for(int i=1;i<=b;i++)
   {
     mul=mul*a;
   }
   return mul;
 }
 }
 