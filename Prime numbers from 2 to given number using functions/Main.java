import java.util.Scanner;
class Main{
  public static void prime(int n)
  {
    int prime = 0;
    for(int i = 2; i<n; i++)
    {
      if(n % i == 0)
      {
		prime = 1;
        break;
      }
    }
    if(prime == 0)
      System.out.println(n);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i = 2; i <= n; i++)
      {
        prime(i);
      }
      
	}
}