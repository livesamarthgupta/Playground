import java.util.Scanner;
class Main{
  	public static int sum(int n)
    {
      int sum = 0;
      for(int i = n; i>0; i--)
        sum = sum + i;
      return sum;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.print(sum(n));
	}
}