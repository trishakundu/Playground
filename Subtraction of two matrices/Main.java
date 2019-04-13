import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc=new Scanner(System.in);
    int row_size=sc.nextInt();
    int col_size=sc.nextInt();
    int matrix1[][]=new int[row_size][col_size];
    for(int i=0;i<=(row_size-1);i++)
    {
      for(int j=0;j<=(col_size-1);j++)
      {
        matrix1[i][j]=sc.nextInt();
      }
    }
    int matrix2[][]=new int[row_size][col_size]; 
    for(int i=0;i<=(row_size-1);i++)
    {
      for(int j=0;j<=(col_size-1);j++)
      {
        matrix2[i][j]=sc.nextInt();
      }
    }
    
    int sum[][]=new int[row_size][col_size];
    subtraction_of_matrix(matrix1,matrix2,sum);
    display(sum);
  }
  public static void subtraction_of_matrix(int matrix1[][],int matrix2[][],int sum[][])
  {
    for(int i=0;i<sum.length;i++)
    {
      for(int j=0;j<sum[i].length;j++)
      {
        sum[i][j]=matrix1[i][j] - matrix2[i][j];
      }
    }
    
  }
 public static void display(int sum [][])
 {
   for(int i=0;i<sum.length;i++)
   {
     for(int j=0;j<sum[i].length;j++)
     {
       System.out.print(sum[i][j] +" ");
     }
     System.out.println();
   }
  }
}