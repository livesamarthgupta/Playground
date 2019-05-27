import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      boolean isPal = true;
      int front = 0;
      int end = str.length() - 1;
      while(front != end)
      {
        if(str.charAt(front) != str.charAt(end))
        {
          isPal = false;
          System.out.print("No");
          break;
        }
        else
        {
          front++;
          end--;
        }
      }
      if(isPal == true)
        System.out.print("Yes");
      
    } 
}