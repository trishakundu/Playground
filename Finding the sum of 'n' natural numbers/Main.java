import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum;
        sum=sum_of_natural(n);
        System.out.print(sum);
    }
  public static int sum_of_natural(int n)
  { 
    int sum;
    if(n==1)
      return 1;
    else
    {
      sum=n+sum_of_natural(n-1);
      return sum;
    }
  }
    
}