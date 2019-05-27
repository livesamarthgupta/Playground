import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    for(int i = 0; i < n/2; i++)
    {
      int key = arr[i];
      int j = i - 1;
      while(j >= 0 && arr[j] > key)
      {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
    for(int i = n/2; i < n; i++)
    {
      int key = arr[i];
      int j = i - 1;
      while(j >= n/2 && arr[j] < key)
      {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
    for(int i : arr)
      System.out.print(i + " ");
  }
}