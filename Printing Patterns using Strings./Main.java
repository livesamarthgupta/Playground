import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str2 = str.substring((str.length() / 2), str.length());
    String newStr = str2 + str.substring(0, (str.length() / 2));
    int n = newStr.length();
    for(int i = 1; i <= n; i++)
    {
      for(int j = 1; j <= n - i; j++)
        System.out.print(" ");
      for(int k = 0; k < i; k++)
        System.out.print(newStr.charAt(k));
      System.out.println();
    }
  }
}