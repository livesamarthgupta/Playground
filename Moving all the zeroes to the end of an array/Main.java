import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int count = 0;
      int arr2[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = sc.nextInt();
        if(arr[i] > 0)
        {
          arr2[count++] = arr[i];
        }
      }
      for(int i = count; i < n; i++)
        arr2[i] = 0;
      for(int i = 0; i < n; i++)
        System.out.print(arr2[i] + " ");
        
      
    }
}