import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n>=85)
        System.out.print("A");
      else if(n>=75)
        System.out.print("B");
      else if(n>=65)
        System.out.print("c");
      else if(n>=55)
        System.out.print("d");
      else if(n>=45)
        System.out.print("e");
      else
        System.out.print("Fail");
      
     
    }
}