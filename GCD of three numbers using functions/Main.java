import java.util.Scanner;
public class Main{
  public static int gcd(int n, int m)
  {
    int min;
    int gcd = 1;
    if(n > m)
      min = m;
    else
      min = n;
    for(int i = min; i >= 1; i--)
    {
		if(n%i==0 && m%i==0)
        {
          gcd = i;
          break;
        }
    }
    return gcd;
  }
      
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int g1 = gcd(n1, n2);
      int g2 = gcd(g1, n3);
      System.out.print(g2);
	}
}