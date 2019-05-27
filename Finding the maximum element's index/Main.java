import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int max = 0;
    int index = 0;
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
      if(arr[i] > max)
      {
        max = arr[i];
        index = i;
      }
    }
    System.out.print(index);
    
  }
}