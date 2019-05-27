import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][] = new int[n][m];
    for(int i = 0; i < n; i++)
      for(int j = 0; j < m; j++)
        arr[i][j] = sc.nextInt();
    int arr2[][] = new int[n][m];
    for(int i = 0; i < n; i++)
      for(int j = 0; j < m; j++)
        arr2[i][j] = sc.nextInt();
    boolean same = true;
    h1: for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < m; j++)
      {
        if(arr[i][j] != arr2[i][j])
        {
          same = false;
          System.out.print("No");
          break h1;
        }
      }
    }
    if(same == true)
      System.out.print("Yes");
  }
}