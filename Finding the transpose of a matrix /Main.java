import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][] = new int[n][m];
    for(int i = 0; i < n; i++)
      for(int j = 0; j < m; j++)
        arr[i][j] = sc.nextInt();
    int arr2[][] = new int[m][n];
    for(int i = 0; i < n; i++)
      for(int j = 0; j < m; j++)
        arr2[j][i] = arr[i][j];
    for(int i = 0; i < m; i++)
    {
      for(int j = 0; j < n; j++)
      {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println();
    }
    
  }
}