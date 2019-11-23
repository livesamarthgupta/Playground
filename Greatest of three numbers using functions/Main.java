import java.util.Scanner;
class Main{
  public static int max(int n, int m)
  {
	int max;
    if(n > m)
      max = n;
    else
      max = m;
    return max;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int m = max(n1, n2);
      int m2 = max(m, n3);
      System.out.print(m2);
	}
}