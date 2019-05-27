import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
      int max = arr[0];
      for(int i = 0; i < n; i++)
      {
		if(max<arr[i])
          max = arr[i];
      }
      System.out.print(max);
    }
}