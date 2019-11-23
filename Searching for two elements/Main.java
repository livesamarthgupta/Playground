import java.util.Scanner;
class Main{
  public static void index(int[] arr, int n, int ele)
  {
    int index = -1;
    for(int i = 0; i<n; i++)
    {
		if(ele == arr[i])
        {
          index = i;
          break;
        }
    }
    System.out.println(index);
  }
  
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
      int ele1 = sc.nextInt();
      int ele2 = sc.nextInt();
      index(arr, n, ele1);
      index(arr, n, ele2);
    }
}