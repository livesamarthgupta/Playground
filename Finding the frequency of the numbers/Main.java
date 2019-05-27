import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n];
      int arr2[] = new int[10];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
      
      for(int i = 0; i < n; i++)
      {
        arr2[arr[i]-1]++;
      }
      for(int i = 0; i < k; i++)
      {
        System.out.println((i+1) + " " + arr2[i]);
      }
        
      
    }
}