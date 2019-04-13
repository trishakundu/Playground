import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int power=in.nextInt();
      int value=1;
      int i=1;
      while(i<=power)
      {
        value=value*base;
        i++;
      }
      System.out.print(value);
    }
}