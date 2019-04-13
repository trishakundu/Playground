import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=(n-i);j++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=(2*i-1);j++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}