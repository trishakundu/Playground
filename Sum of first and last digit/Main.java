import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int last_digit=n%10;
      while(n>=10)
      {
        n=n/10;
      }
      int first_digit=n;
      int sum=last_digit+first_digit;
      System.out.println(sum);
	}
}