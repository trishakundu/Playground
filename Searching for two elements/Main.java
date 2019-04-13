import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int index=0;index<=(arr_size-1);index++)
      {
        arr[index]=in.nextInt();
      }
      int search_ele1=in.nextInt();
      int search_ele2=in.nextInt();
      int ele_idx1=-1;
      int ele_idx2=-1;
      for(int index=0;index<=(arr_size-1);index++)
      {
        if(search_ele1==arr[index])
        {
          ele_idx1=index;
        }
        if(search_ele2==arr[index])
        {
          ele_idx2=index;
        }
      }
      System.out.println(ele_idx1);
      System.out.println(ele_idx2);
    }        
}
