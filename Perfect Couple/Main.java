import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=(arr_size-1);i++)
      {
        arr[i]=in.nextInt();
      }
      int value=in.nextInt();
      perfect(arr,arr_size,value);
    }
  public static void perfect(int arr[],int arr_size,int value)
  {
    int sum=0;
    for(int index1=0;index1<=(arr_size-1);index1++)
    {
      for(int index2=index1+1;index2<=(arr_size-1);index2++)
      {
        sum=arr[index1]+arr[index2];
        if(sum==value)
        {
          System.out.println(arr[index1] + "," + " " + arr[index2]);
        }
      }
    }
    }
}