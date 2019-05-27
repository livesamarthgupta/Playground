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
    int r = sc.nextInt();
    int temp1; 
    int temp2;
    while(r > 0)
    {
      if(n % 2 == 0)
      {
        temp1 = arr[n-2];
      }
      else
      {
        temp1 = arr[n-1];
      }
      temp2 = arr[1];
      int temp = arr[0];
      for(int i = 0; i+2 < n; i += 2)
      {
        int temp3 = arr[i+2];
        arr[i+2] = temp;
        temp = temp3;
      }
      arr[0] = temp1;
      for(int i = 1; i+2 < n; i += 2)
      {
        arr[i] = arr[i+2];
      }
      if(n % 2 == 0)
        arr[n-1] = temp2;
      else
        arr[n-2] = temp2;
      r--;
    }
    for(int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    
  	}
}