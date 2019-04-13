import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num;
    int n=in.nextInt();
    for(num=1;num<=n;num++)
    {
      System.out.print("*");
      System.out.print("\n");
    }
  }
}