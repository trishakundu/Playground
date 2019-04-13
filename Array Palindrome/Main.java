import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr_size=sc.nextInt();
        int arr[]=new int[arr_size];
        int left=0;
        int right=arr_size-1;
        boolean is_palindrome=true;
      for(int index=0;index<(arr_size);index++)
      {
        arr[index]=sc.nextInt();
      }
      while(left<right)
      {
        if(arr[left]!=arr[right])
        {
          is_palindrome=false;
          break;
        }
        left++;
        right--;
      }
      if(is_palindrome==false)
      {
        System.out.print("No");
      }
      else
      {
        System.out.print("Yes");
      }
      
    }
}