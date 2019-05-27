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
    int freq[] = new int[10];
    for(int i = 0; i < n; i++)
    {
      freq[arr[i]]++;
    }
    int max = freq[0];
    int index = arr[0];
    for(int i = 0; i < 10; i++)
    {
      if(max < freq[i])
      {
        max = freq[i];
        index = i;
      }
    }
    System.out.print(index);
    
    
  }
}