import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = 1;
      for(int i = 1; i <= n+n; i++)
      {
        if(temp % 2 == 1)
          System.out.println(temp);
        temp += 1;
      }
	}
}