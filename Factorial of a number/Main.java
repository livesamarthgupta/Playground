import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int fact = 1;
      while(n > 0)
      {
        fact = fact * n;
        n -= 1;
      }
      System.out.print(fact);
	}
}