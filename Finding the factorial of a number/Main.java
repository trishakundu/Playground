import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int f=fact(n);
    System.out.print(f);
  }
  public static int fact(int n)
  {
    int f;
    if(n==1)
    {
      return 1;
    }
    else
    {
      f=n*fact(n-1);
      return f;
    }
    
  }
}