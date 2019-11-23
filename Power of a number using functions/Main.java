import java.util.Scanner;
class Main
{
  public static int power(int b, int e)
  {
    int res = 1;
	while(e != 0)
    {
      res = res * b;
      e -= 1;
    }
    return res;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.print(power(n,m));
  }
}