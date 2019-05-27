import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int count = 0;
    boolean isPerfect = true;
    int sum = arr[0] + arr[1] + arr[2];
    int sum1 = 0;
    for(int i = 0; i <(n/3); i++)
    {
      for(int j = count; j < count+3; j++)
      {
        sum1 += arr[j];
      }
      count += 3;
      if(sum1 != sum)
      {
        isPerfect = false;
        break;
      }
      else
      {
		sum1 = 0;
      }
    }
    if(isPerfect == true)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}