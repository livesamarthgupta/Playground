import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int ln = n % 10;
      int fn = 0;
      while(n > 0)
      {
        fn = n%10;
        n = n/10;
      }
      System.out.print(fn+ln);
	}
}