import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int square=sq(n);
      System.out.print(square);
	} 
  public static int sq(int a)
  {
    int square=a*a;
    return square;
  }
}