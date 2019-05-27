import java.util.Scanner;
class Main
{
    public static int sqr(int n)
    {
      return n*n;
    }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.print(sqr(n));
	} 
}