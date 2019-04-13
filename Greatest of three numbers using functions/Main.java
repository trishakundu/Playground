import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
	    int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int larg_no=larg(n1,n2,n3);
      System.out.print(larg_no);
	}
  public static int larg(int n1,int n2,int n3)
  {
    int large=1;
    if(n1>n2)
    {
      if(n1>n3)
      {
        large=n1;
      }
      else
        large=n3;
    }
    if(n2>n1)
    {
      if(n2>n3)
      {
        large=n2;
      }
      else
        large=n3;
    }
    return large;
  }
}