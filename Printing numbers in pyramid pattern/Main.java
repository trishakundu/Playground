import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      int count=1;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=(n-i);j++)
          System.out.print(" ");
        for(j=1;j<=i;j++)
        {
          System.out.print(count);
          System.out.print(" ");
          count=count+1;
        }
        System.out.print("\n");
      }
    }    
}