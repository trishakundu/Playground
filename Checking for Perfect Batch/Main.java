import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    for(int idx=0;idx<=(n-1);idx++)
    {
      list[idx]=sc.nextInt();
    }
    perfect_batch(list,n);
  }
  public static void perfect_batch(int list[],int n)
  {
    boolean is_perfect=true;
    int batch_sum=list[0]+list[1]+list[2];
    int curr_batch_sum=0;
    for(int idx=3;idx<=(n-1);idx=idx+3)
    {
      curr_batch_sum=list[idx]+list[idx+1]+list[idx+2];
    }
    if(curr_batch_sum!=batch_sum)
    {
      is_perfect=false;
    }
    if(is_perfect==true)
      System.out.print("Perfect Batch");
    else
     System.out.print("Not a Perfect Batch");
  }
}