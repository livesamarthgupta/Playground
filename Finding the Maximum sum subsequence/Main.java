import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int sum[] = new int[n];
    int q = 0;
    for(int i = 0; i < n; i++)
    {
      int index = i;
      int check = arr[i];
      for(int j = i+1; j < n; j++)
      {
        if(check < arr[j])
        {
          check = arr[j];
          index = j;
        }
        else
          break;
      }
      for(int k = i; k <= index; k++)
        sum[q] += arr[k];
      i = index;
      q++;
    }
    int max = sum[0];
    for(int i = 0; i < n; i++)
    {
      if(sum[i] > max)
        max = sum[i];
    }
    System.out.print(max);
        
  }
}