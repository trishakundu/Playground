import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=sumofdigit(n);
   System.out.print(sum);
	}
  public static int sumofdigit(int b)
  {
    int sum=0;
    for(int i=1;i<=b;i++)
    {
    sum=sum+i;
    }
    return sum;
  }
}