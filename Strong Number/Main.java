import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = n;
      int sum_fact = 0;
      int fact = 1;
      int nd = 0;
      while(temp > 0)
      {
        nd = temp % 10;
        for (int i = 1; i<= nd; i++)
        {
          fact = fact * i;
        }
        sum_fact += fact;
        fact = 1;
        temp = temp / 10;
      }
      if(n == sum_fact)
        System.out.print("Yes");
      else
        System.out.print("No");
        
	}
}