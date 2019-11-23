import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
      int k = sc.nextInt();
      for(int i = 0; i < n-1; i++)
      {
        int min = arr[i];
        int minIndex = i;
        for(int j = i+1; j < n; j++)
        {
          if(min < arr[j])
          {
            min = arr[j];
            minIndex = j;
          }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
      }
      System.out.print(arr[k-1]);
    }   
}