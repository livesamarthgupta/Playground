import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
      int count = 0;
      int newCount = 0;
      for(int i = 0; i < n; i++)
      {
        count = 0;
        int check = arr[i];
        int index = i;
        for(int j = i+1; j < n; j++)
        {
          if(check == 1)
          {
            check = arr[j];
            index = j;
            count++;
          }
          else
            break;
        }
        i = index;
        if(count > newCount)
          newCount = count;
      }
      System.out.print(newCount);
        
    }
}