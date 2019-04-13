import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int matrix[][]=new int[r][c];
    for(int i=0;i<=(r-1);i++)
    {
      for(int j=0;j<=(c-1);j++)
      {
        matrix[i][j]=sc.nextInt();
      }
    }
    upper_triangular(matrix,r,c);
  }
  public static void upper_triangular(int matrix[][],int r,int c)
  {
    int i,j,k;
    for(k=0;k<c;k++)
    {
      for( i=0, j=k ;j<c; i++, j++)
      {
        System.out.print(matrix[i][j] + " ");
      }
    
    }
  }
  }
