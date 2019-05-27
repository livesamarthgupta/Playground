import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int col = sc.nextInt();
      for(int i = row; i >= 1; i--)
      {
        for(int j = col; j > i; j--)
        {
          System.out.print(j);
        }
        for(int k = 1; k <= i; k++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
    }
}