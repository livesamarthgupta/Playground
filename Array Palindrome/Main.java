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
      int front = 0;
      int end = n - 1;
      boolean isPalindrome = true;
      while(front < end)
      {
        if(arr[front] == arr[end])
        {
          front++;
          end--;
          continue;
        }
        else
        {
          isPalindrome = false;
          System.out.print("No");
          break;
        }
      }
      if(isPalindrome == true)
        System.out.print("Yes");
        
    }
}   
//this progrma finds palindrome
